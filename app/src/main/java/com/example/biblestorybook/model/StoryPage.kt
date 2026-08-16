package com.example.biblestorybook.model

import androidx.annotation.RawRes

/**
 * Represents an interactive element within a story scene.
 *
 * x and y represent the TOP-LEFT position as a ratio of the screen:
 * 0.0 = left/top, 1.0 = right/bottom.
 * width and height are also ratios of the available screen size.
 */
data class Hotspot(
    val id: String,
    val x: Float,
    val y: Float,
    val width: Float,
    val height: Float,
    val action: HotspotAction
)

/**
 * Actions that can be triggered by tapping a hotspot.
 */
sealed class HotspotAction {

    data class PlaySound(
        @RawRes val soundResId: Int
    ) : HotspotAction()

    data class PlayNarration(
        @RawRes val audioResId: Int
    ) : HotspotAction()

    data class PlayAnimation(
        val animationId: String
    ) : HotspotAction()

    data class SoundAndAnimation(
        @RawRes val soundResId: Int,
        val animationId: String
    ) : HotspotAction()
}

/**
 * A scene's narration voiceover. autoPlay defaults to true: narration
 * starts alongside the scene's video, muting it for the duration. The
 * on-screen text panel can still be tapped to replay narration at any time.
 */
data class Narration(
    val text: String,
    @RawRes val audioResId: Int? = null,
    val autoPlay: Boolean = true
)

/**
 * Represents one page/scene in the interactive storybook.
 */
data class StoryPage(
    val id: Int,
    val title: String,

    // Looping background video, plays automatically with its own audio
    // (character dialogue).
    @RawRes val videoResId: Int,

    // On-screen narration text + optional tap-to-play voiceover.
    val narration: Narration,

    // Optional background music.
    @RawRes val backgroundMusicResId: Int? = null,

    // Interactive objects (empty in v1 — no hotspot SFX/animation assets yet).
    val hotspots: List<Hotspot> = emptyList()
)
