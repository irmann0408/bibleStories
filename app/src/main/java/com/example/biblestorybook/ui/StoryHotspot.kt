package com.example.biblestorybook.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.biblestorybook.model.Hotspot
import com.example.biblestorybook.model.HotspotAction
import kotlin.math.roundToInt

/**
 * Renders an invisible, ratio-positioned tap target for a [Hotspot].
 *
 * Not wired to real sound/animation triggers yet — v1 story data always
 * supplies an empty hotspot list, so this is currently unused at runtime.
 * Kept in place so hotspot interactions can be added later without
 * restructuring [StoryBookScreen].
 */
@Composable
fun StoryHotspot(
    hotspot: Hotspot,
    screenWidth: Float,
    screenHeight: Float,
    onTriggered: (HotspotAction) -> Unit
) {
    val xPosition = (screenWidth * hotspot.x).roundToInt()
    val yPosition = (screenHeight * hotspot.y).roundToInt()
    val hotspotWidth = (screenWidth * hotspot.width).roundToInt()
    val hotspotHeight = (screenHeight * hotspot.height).roundToInt()

    Box(
        modifier = Modifier
            .offset { IntOffset(x = xPosition, y = yPosition) }
            .width(hotspotWidth.dp)
            .height(hotspotHeight.dp)
            .clickable { onTriggered(hotspot.action) }
        // No background — the hotspot is invisible during normal gameplay.
    )
}
