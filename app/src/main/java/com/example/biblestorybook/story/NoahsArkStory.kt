package com.example.biblestorybook.story

import com.example.biblestorybook.R
import com.example.biblestorybook.model.Narration
import com.example.biblestorybook.model.StoryPage

object NoahsArkStory {

    val pages: List<StoryPage> = listOf(
        StoryPage(
            id = 1,
            title = "The Warning & Mandate",
            videoResId = R.raw.noahs_ark_scene_01,
            narration = Narration(
                text = "God saw that the earth was full of trouble, but Noah walked " +
                    "with God. God said, 'Build an ark of wood, for a great flood is " +
                    "coming to renew the earth.'",
                audioResId = R.raw.noahs_ark_scene_01_narration
            )
        ),
        StoryPage(
            id = 2,
            title = "Building the Ark",
            videoResId = R.raw.noahs_ark_scene_02,
            narration = Narration(
                text = "Noah obeyed. He and his family chopped timber, shaped heavy " +
                    "planks, and sealed every seam with pitch to keep the water out.",
                audioResId = R.raw.noahs_ark_scene_02_narration
            )
        ),
        StoryPage(
            id = 3,
            title = "Animals Two by Two",
            videoResId = R.raw.noahs_ark_scene_03,
            narration = Narration(
                text = "From every creature on earth, animals came two by two—male " +
                    "and female, bird and beast—marching safely into the ark.",
                audioResId = R.raw.noahs_ark_scene_03_narration
            )
        ),
        StoryPage(
            id = 4,
            title = "The Great Flood",
            videoResId = R.raw.noahs_ark_scene_04,
            narration = Narration(
                text = "The rain fell for forty days and forty nights. Deep waters " +
                    "rose over the hills, and the ark floated safely above the flood.",
                audioResId = R.raw.noahs_ark_scene_04_narration
            )
        ),
        StoryPage(
            id = 5,
            title = "The Dove & Land",
            videoResId = R.raw.noahs_ark_scene_05,
            narration = Narration(
                text = "Noah sent out a dove to search for land. It returned carrying " +
                    "a fresh olive leaf in its beak—a sign that dry land had finally " +
                    "appeared.",
                audioResId = R.raw.noahs_ark_scene_05_narration
            )
        ),
        StoryPage(
            id = 6,
            title = "The Rainbow Promise",
            videoResId = R.raw.noahs_ark_scene_06,
            narration = Narration(
                text = "The doors opened and life returned to the earth. God placed " +
                    "a bright rainbow in the sky as a lasting promise of peace and hope.",
                audioResId = R.raw.noahs_ark_scene_06_narration
            )
        ),
        StoryPage(
            id = 7,
            title = "Thanks be to God",
            videoResId = R.raw.noahs_ark_scene_07,
            narration = Narration(
                text = "We can trust God, even when we have to wait. Genesis 9:13, " +
                    "\"I have set my rainbow in the clouds, and it will be the sign " +
                    "of the covenant between me and the earth.\"",
                audioResId = R.raw.noahs_ark_scene_07_narration
            )
        )
    )
}
