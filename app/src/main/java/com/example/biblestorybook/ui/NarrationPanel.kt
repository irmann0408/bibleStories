package com.example.biblestorybook.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Bottom narration text panel. Tapping it (anywhere, including the "▶"
 * hint) (re)plays the scene's narration voiceover from the start —
 * narration never plays automatically.
 *
 * Height is capped so a long narration (e.g. a scene combining several
 * story beats) scrolls internally instead of growing tall enough to cover
 * most of the video behind it.
 */
@Composable
fun NarrationPanel(
    text: String,
    onTap: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .heightIn(max = 200.dp)
            .background(
                color = Color.Black.copy(alpha = 0.65f),
                shape = RoundedCornerShape(12.dp)
            )
            .clickable(onClick = onTap)
            .padding(16.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "▶",
            color = Color.White,
            modifier = Modifier.padding(end = 12.dp)
        )
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier.verticalScroll(rememberScrollState())
        )
    }
}
