package com.example.biblestorybook.model

/**
 * A complete, selectable Bible story: a title shown on the selection
 * screen and its ordered list of scenes.
 */
data class Story(
    val id: String,
    val title: String,
    val pages: List<StoryPage>
)
