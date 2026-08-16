package com.example.biblestorybook.story

import com.example.biblestorybook.model.Story

/**
 * All stories available for selection. Add a new Story entry here as each
 * new story's scenes are built — nothing else needs to change to make it
 * selectable.
 */
object StoryLibrary {
    val stories: List<Story> = listOf(
        Story(
            id = "david_and_goliath",
            title = "David & Goliath",
            pages = DavidAndGoliathStory.pages
        )
    )
}
