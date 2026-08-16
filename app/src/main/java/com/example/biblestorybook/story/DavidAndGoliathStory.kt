package com.example.biblestorybook.story

import com.example.biblestorybook.R
import com.example.biblestorybook.model.Narration
import com.example.biblestorybook.model.StoryPage

object DavidAndGoliathStory {

    val pages: List<StoryPage> = listOf(
        StoryPage(
            id = 1,
            title = "The Faithful Shepherd",
            videoResId = R.raw.scene_01,
            narration = Narration(
                text = "Long ago, in Israel, lived a young shepherd boy named David. " +
                    "He spent his days watching his father's sheep, singing songs of " +
                    "praise, and trusting God with all his heart.",
                audioResId = R.raw.scene_01_narration
            )
        ),
        StoryPage(
            id = 2,
            title = "The Giant's Challenge",
            videoResId = R.raw.scene_02,
            narration = Narration(
                text = "One day, a huge warrior named Goliath challenged the Israelite " +
                    "army. He was over nine feet tall! Everyone was terrified.",
                audioResId = R.raw.scene_02_narration
            )
        ),
        StoryPage(
            id = 3,
            title = "David Arrives",
            videoResId = R.raw.scene_03,
            narration = Narration(
                text = "David came to the camp to bring food to his older brothers. " +
                    "When he saw the army hiding, he asked, 'Why is everyone afraid?'",
                audioResId = R.raw.scene_03_narration
            )
        ),
        StoryPage(
            id = 4,
            title = "The Heavy Armor",
            videoResId = R.raw.scene_04,
            narration = Narration(
                text = "King Saul offered David his own heavy armor and sharp sword. " +
                    "But David could barely move! He smiled and said that he cannot " +
                    "wear the armor.",
                audioResId = R.raw.scene_04_narration
            )
        ),
        StoryPage(
            id = 5,
            title = "Five Smooth Stones",
            videoResId = R.raw.scene_05,
            narration = Narration(
                text = "Instead of armor, David took his walking staff and his simple " +
                    "slingshot. He walked down to a nearby stream and chose five smooth " +
                    "stones. He was ready to face the giant.",
                audioResId = R.raw.scene_05_narration
            )
        ),
        StoryPage(
            id = 6,
            title = "The Confrontation",
            videoResId = R.raw.scene_06,
            narration = Narration(
                text = "Goliath laughed when he saw a boy walking toward him. " +
                    "But David shouted back, \"You come against me with a sword and " +
                    "spear, but I come against you in the name of the Lord!\"",
                audioResId = R.raw.scene_06_narration
            )
        ),
        StoryPage(
            id = 7,
            title = "Victory",
            videoResId = R.raw.scene_07,
            narration = Narration(
                text = "With a mighty swing, David let the stone fly. Thwack! It " +
                    "struck Goliath right on the forehead, and the giant fell to the " +
                    "ground. God had saved His people through a brave shepherd boy.",
                audioResId = R.raw.scene_07_narration
            )
        ),
        StoryPage(
            id = 8,
            title = "Glory to God",
            videoResId = R.raw.scene_08,
            narration = Narration(
                text = "Remember... When we are afraid, we can trust God.",
                audioResId = R.raw.scene_08_narration
            )
        )
    )
}
