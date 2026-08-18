package com.example.biblestorybook.story

import com.example.biblestorybook.R
import com.example.biblestorybook.model.Narration
import com.example.biblestorybook.model.StoryPage

object DanielLionsStory {

    val pages: List<StoryPage> = listOf(
        StoryPage(
            id = 1,
            title = "The King's Decree",
            videoResId = R.raw.daniel_lions_scene_01,
            narration = Narration(
                text = "King Darius loved Daniel because Daniel was wise and honest. " +
                    "But the king's other advisors were jealous. They tricked the " +
                    "king into making a strict new law: for thirty days, anyone who " +
                    "prayed to God instead of the king would be thrown into a den of " +
                    "lions!",
                audioResId = R.raw.daniel_lions_scene_01_narration
            )
        ),
        StoryPage(
            id = 2,
            title = "Daniel Prays",
            videoResId = R.raw.daniel_lions_scene_02,
            narration = Narration(
                text = "Daniel knew about the new decree, but he refused to hide his " +
                    "love for God. Three times a day, just as he had always done, " +
                    "Daniel opened his window toward Jerusalem, knelt down, and " +
                    "prayed to God.",
                audioResId = R.raw.daniel_lions_scene_02_narration
            )
        ),
        StoryPage(
            id = 3,
            title = "Thrown to the Lions",
            videoResId = R.raw.daniel_lions_scene_03,
            narration = Narration(
                text = "The jealous advisors caught Daniel praying and dragged him " +
                    "to the king. King Darius was heartbroken, but he couldn't break " +
                    "his own law. With a heavy heart, he put Daniel into the pit. " +
                    "But God sent an angel to shut the lions' mouths!",
                audioResId = R.raw.daniel_lions_scene_03_narration
            )
        ),
        StoryPage(
            id = 4,
            title = "The Next Morning",
            videoResId = R.raw.daniel_lions_scene_04,
            narration = Narration(
                text = "At the very first light of dawn, King Darius rushed back to " +
                    "the pit. He cried out, 'Daniel, was your God able to save you?' " +
                    "Daniel called back, 'My God sent His angel, and the lions have " +
                    "not hurt me!' The king was overjoyed.",
                audioResId = R.raw.daniel_lions_scene_04_narration
            )
        ),
        StoryPage(
            id = 5,
            title = "A New Proclamation",
            videoResId = R.raw.daniel_lions_scene_05,
            narration = Narration(
                text = "Daniel kept praying to God even when it was risky, and God " +
                    "kept him safe. When we stay faithful, God is with us no matter " +
                    "what happens. Daniel 6:22, \"My God has sent his angel, and has " +
                    "shut the lions' mouths, and they have not hurt me, because " +
                    "innocence was found in me before him; and also before you, O " +
                    "King, I have done no harm.\"",
                audioResId = R.raw.daniel_lions_scene_05_narration
            )
        )
    )
}
