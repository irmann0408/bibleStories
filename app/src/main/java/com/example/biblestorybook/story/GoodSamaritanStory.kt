package com.example.biblestorybook.story

import com.example.biblestorybook.R
import com.example.biblestorybook.model.Narration
import com.example.biblestorybook.model.StoryPage

object GoodSamaritanStory {

    val pages: List<StoryPage> = listOf(
        StoryPage(
            id = 1,
            title = "The Journey on a Dangerous Road",
            videoResId = R.raw.good_samaritan_scene_01,
            narration = Narration(
                text = "A man was traveling down a steep, rocky road from Jerusalem " +
                    "to Jericho. The road was famous for being unsafe and full of " +
                    "sharp turns. He walked alone, not knowing what danger waited " +
                    "just ahead.",
                audioResId = R.raw.good_samaritan_scene_01_narration
            )
        ),
        StoryPage(
            id = 2,
            title = "Trouble on the Road",
            videoResId = R.raw.good_samaritan_scene_02,
            narration = Narration(
                text = "Suddenly, bad men jumped out from the shadows! They took " +
                    "all his money, ripped his clothes, and hurt him badly. They " +
                    "left him lying on the dusty ground, half-dead and unable to " +
                    "move.",
                audioResId = R.raw.good_samaritan_scene_02_narration
            )
        ),
        StoryPage(
            id = 3,
            title = "The First Passerby (The Priest)",
            videoResId = R.raw.good_samaritan_scene_03,
            narration = Narration(
                text = "A religious leader came walking down the road. He saw the " +
                    "hurt man lying right in his path. But instead of stopping to " +
                    "help, he walked far around him on the other side and hurried " +
                    "away.",
                audioResId = R.raw.good_samaritan_scene_03_narration
            )
        ),
        StoryPage(
            id = 4,
            title = "The Second Passerby (The Levite)",
            videoResId = R.raw.good_samaritan_scene_04,
            narration = Narration(
                text = "Next, another church helper came by. He walked over, looked " +
                    "closely at the wounded traveler, and sighed. But he was too " +
                    "scared or busy to help, so he kept walking too.",
                audioResId = R.raw.good_samaritan_scene_04_narration
            )
        ),
        StoryPage(
            id = 5,
            title = "The Good Samaritan Arrives",
            videoResId = R.raw.good_samaritan_scene_05,
            narration = Narration(
                text = "Then, a Samaritan man on his donkey saw the hurt man, his " +
                    "heart felt heavy with pity. He stopped, cleaned his cuts with " +
                    "soothing oil, and wrapped them gently. He put the man on his " +
                    "own donkey and brought him to a safe inn to rest. Jesus asks " +
                    "us: Who proved to be a neighbor? The one who showed mercy. " +
                    "Luke 10:33, \"But a certain Samaritan, as he traveled, came " +
                    "where he was. When he saw him, he was moved with compassion.\"",
                audioResId = R.raw.good_samaritan_scene_05_narration
            )
        )
    )
}
