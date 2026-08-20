package com.example.biblestorybook.story

import com.example.biblestorybook.R
import com.example.biblestorybook.model.Narration
import com.example.biblestorybook.model.StoryPage

object BattleOfJerichoStory {

    val pages: List<StoryPage> = listOf(
        StoryPage(
            id = 1,
            title = "Spies in the City",
            videoResId = R.raw.battle_of_jericho_scene_01,
            narration = Narration(
                text = "To conquer the promised land, Joshua sent two spies to " +
                    "scout the heavily fortified city of Jericho. In the shadows, " +
                    "an unexpected ally named Rahab risked everything to hide " +
                    "them.",
                audioResId = R.raw.battle_of_jericho_scene_01_narration
            )
        ),
        StoryPage(
            id = 2,
            title = "The Scarlet Cord",
            videoResId = R.raw.battle_of_jericho_scene_02,
            narration = Narration(
                text = "In exchange for her protection, the spies promised " +
                    "safety for her household. Her house would be marked by a " +
                    "single, crimson thread.",
                audioResId = R.raw.battle_of_jericho_scene_02_narration
            )
        ),
        StoryPage(
            id = 3,
            title = "The Locked Gates",
            videoResId = R.raw.battle_of_jericho_scene_03,
            narration = Narration(
                text = "Fear gripped Jericho. The gates were barred shut. None " +
                    "went out, and none came in.",
                audioResId = R.raw.battle_of_jericho_scene_03_narration
            )
        ),
        StoryPage(
            id = 4,
            title = "The Divine Plan",
            videoResId = R.raw.battle_of_jericho_scene_04,
            narration = Narration(
                text = "But the Lord told Joshua: 'See, I have delivered " +
                    "Jericho into your hands.' God revealed an unconventional " +
                    "battle plan.",
                audioResId = R.raw.battle_of_jericho_scene_04_narration
            )
        ),
        StoryPage(
            id = 5,
            title = "The Daily March",
            videoResId = R.raw.battle_of_jericho_scene_05,
            narration = Narration(
                text = "The army was ordered to march around the city once a " +
                    "day for six days. Leading the way were seven priests " +
                    "carrying trumpets before the Ark of the Covenant.",
                audioResId = R.raw.battle_of_jericho_scene_05_narration
            )
        ),
        StoryPage(
            id = 6,
            title = "Days One through Six",
            videoResId = R.raw.battle_of_jericho_scene_06,
            narration = Narration(
                text = "For six days, they marched in absolute silence. No war " +
                    "cries. No taunts. Only the steady rhythm of faithful " +
                    "footsteps.",
                audioResId = R.raw.battle_of_jericho_scene_06_narration
            )
        ),
        StoryPage(
            id = 7,
            title = "Seven Times Around",
            videoResId = R.raw.battle_of_jericho_scene_07,
            narration = Narration(
                text = "On the seventh day, they rose at dawn. This day would " +
                    "be different. They circled the city not once, but seven " +
                    "times. With every lap, the tension in Jericho reached a " +
                    "breaking point.",
                audioResId = R.raw.battle_of_jericho_scene_07_narration
            )
        ),
        StoryPage(
            id = 8,
            title = "The Long Blast and Shout",
            videoResId = R.raw.battle_of_jericho_scene_08,
            narration = Narration(
                text = "On the seventh lap, the priests blew a magnificent " +
                    "blast. Joshua commanded: 'Shout! For the Lord has given you " +
                    "the city!'",
                audioResId = R.raw.battle_of_jericho_scene_08_narration
            )
        ),
        StoryPage(
            id = 9,
            title = "The Walls Fall",
            videoResId = R.raw.battle_of_jericho_scene_09,
            narration = Narration(
                text = "The foundations failed. The massive walls collapsed " +
                    "flat to the ground, and the army took the city—just as God " +
                    "had promised.",
                audioResId = R.raw.battle_of_jericho_scene_09_narration
            )
        )
    )
}
