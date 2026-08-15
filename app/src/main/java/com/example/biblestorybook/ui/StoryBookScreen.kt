package com.example.biblestorybook.ui

import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.example.biblestorybook.model.StoryPage

@Composable
fun StoryBookScreen(
    pages: List<StoryPage>,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var currentPageIndex by rememberSaveable { mutableIntStateOf(0) }
    val currentPage = pages[currentPageIndex]

    val videoPlayer = remember { ExoPlayer.Builder(context).build() }
    val narrationPlayer = remember { ExoPlayer.Builder(context).build() }

    DisposableEffect(Unit) {
        // Video is muted for as long as narration is playing, then
        // un-muted once the narration finishes.
        val listener = object : Player.Listener {
            override fun onPlaybackStateChanged(playbackState: Int) {
                if (playbackState == Player.STATE_ENDED) {
                    videoPlayer.volume = 1f
                }
            }
        }
        narrationPlayer.addListener(listener)

        onDispose {
            narrationPlayer.removeListener(listener)
            videoPlayer.release()
            narrationPlayer.release()
        }
    }

    LaunchedEffect(currentPageIndex) {
        // Background video: autoplay, loop, own audio (character dialogue).
        videoPlayer.volume = 1f
        videoPlayer.setMediaItem(rawResMediaItem(context.packageName, currentPage.videoResId))
        videoPlayer.repeatMode = Player.REPEAT_MODE_ONE
        videoPlayer.prepare()
        videoPlayer.playWhenReady = true

        // Narration: prepared and ready, but never autoplays — only starts
        // when the user taps the narration panel.
        narrationPlayer.stop()
        currentPage.narration.audioResId?.let { resId ->
            narrationPlayer.setMediaItem(rawResMediaItem(context.packageName, resId))
            narrationPlayer.repeatMode = Player.REPEAT_MODE_OFF
            narrationPlayer.prepare()
            narrationPlayer.playWhenReady = false
        }
    }

    Box(modifier = modifier.fillMaxSize()) {

        StoryVideoBackground(
            player = videoPlayer,
            modifier = Modifier.fillMaxSize()
        )

        // Hotspot overlay — a no-op while every page's hotspots list is empty.
        BoxWithConstraints(Modifier.fillMaxSize()) {
            val screenWidthPx = constraints.maxWidth.toFloat()
            val screenHeightPx = constraints.maxHeight.toFloat()
            currentPage.hotspots.forEach { hotspot ->
                StoryHotspot(
                    hotspot = hotspot,
                    screenWidth = screenWidthPx,
                    screenHeight = screenHeightPx,
                    onTriggered = { /* TODO v2: handleHotspotAction(it) */ }
                )
            }
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            NarrationPanel(
                text = currentPage.narration.text,
                onTap = {
                    videoPlayer.volume = 0f
                    narrationPlayer.seekTo(0)
                    narrationPlayer.play()
                },
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { if (currentPageIndex > 0) currentPageIndex-- },
                    enabled = currentPageIndex > 0
                ) {
                    Text("Previous")
                }

                Button(
                    onClick = { if (currentPageIndex < pages.lastIndex) currentPageIndex++ },
                    enabled = currentPageIndex < pages.lastIndex
                ) {
                    Text("Next")
                }
            }
        }
    }
}

private fun rawResMediaItem(packageName: String, rawResId: Int): MediaItem =
    MediaItem.fromUri(Uri.parse("android.resource://$packageName/$rawResId"))
