package com.example.biblestorybook.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.biblestorybook.model.Story

/**
 * Top-level app: switches between the story selection screen and the
 * currently playing story. Plain local state rather than a navigation
 * library — revisit if/when the post-story reflection flow needs more
 * than two screens.
 */
@Composable
fun BibleStorybookApp() {
    var selectedStory by remember { mutableStateOf<Story?>(null) }
    val story = selectedStory

    if (story == null) {
        StorySelectionScreen(onStorySelected = { selectedStory = it })
    } else {
        StoryBookScreen(pages = story.pages, onBack = { selectedStory = null })
    }
}
