package com.example.biblestorybook.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView

@Composable
fun StoryVideoBackground(
    player: ExoPlayer,
    modifier: Modifier = Modifier
) {
    AndroidView(
        modifier = modifier.fillMaxSize(),
        factory = { context ->
            PlayerView(context).apply {
                useController = false
                // Scenes are 1280x720 landscape; FIT letterboxes them fully
                // visible on a tall portrait screen instead of cropping most
                // of the frame away (what RESIZE_MODE_ZOOM was doing here).
                resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIT
                this.player = player
            }
        }
    )
}
