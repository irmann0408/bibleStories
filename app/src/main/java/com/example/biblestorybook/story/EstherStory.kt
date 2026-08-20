package com.example.biblestorybook.story

import com.example.biblestorybook.R
import com.example.biblestorybook.model.Narration
import com.example.biblestorybook.model.StoryPage

object EstherStory {

    val pages: List<StoryPage> = listOf(
        StoryPage(
            id = 1,
            title = "A New Queen in Persia",
            videoResId = R.raw.esther_scene_01,
            narration = Narration(
                text = "The King chose Esther, and she was crowned Queen of " +
                    "Persia. Though she lived in a magnificent palace, Esther kept " +
                    "a secret: she and her cousin Mordecai were part of God's " +
                    "chosen people, the Israelites.",
                audioResId = R.raw.esther_scene_01_narration
            )
        ),
        StoryPage(
            id = 2,
            title = "Mordecai Saves the King",
            videoResId = R.raw.esther_scene_02,
            narration = Narration(
                text = "Mordecai overhears two guards plotting to kill the King. " +
                    "He needs to deliver the message to Esther to save the King.",
                audioResId = R.raw.esther_scene_02_narration
            )
        ),
        StoryPage(
            id = 3,
            title = "A Dangerous Plan",
            videoResId = R.raw.esther_scene_03,
            narration = Narration(
                text = "A powerful official named Haman grew angry because " +
                    "Esther's cousin, Mordecai, refused to bow down to him. Out " +
                    "of pride and anger, Haman tricked the King into signing a " +
                    "terrible law to destroy all of Esther's people.",
                audioResId = R.raw.esther_scene_03_narration
            )
        ),
        StoryPage(
            id = 4,
            title = "Born for Such a Time",
            videoResId = R.raw.esther_scene_04,
            narration = Narration(
                text = "When Mordecai heard of the law, he sent a message to " +
                    "Esther: \"Do not think that because you are in the palace " +
                    "you alone will escape. Who knows but that you have come to " +
                    "your royal position for such a time as this?\"",
                audioResId = R.raw.esther_scene_04_narration
            )
        ),
        StoryPage(
            id = 5,
            title = "Faith and Courage",
            videoResId = R.raw.esther_scene_05,
            narration = Narration(
                text = "Esther knew that going to the King without being invited " +
                    "was against the law and very dangerous. She asked all her " +
                    "people to fast and pray with her for three days. \"I will go " +
                    "to the King,\" she said with courage, \"and if I perish, I " +
                    "perish.\"",
                audioResId = R.raw.esther_scene_05_narration
            )
        ),
        StoryPage(
            id = 6,
            title = "Before the King",
            videoResId = R.raw.esther_scene_06,
            narration = Narration(
                text = "On the third day, Esther dressed in her royal robes and " +
                    "walked into the throne room. When the King saw her, God " +
                    "filled his heart with favor. He extended his golden scepter " +
                    "to her, granting her safety, and asked, \"What is your " +
                    "request, Queen Esther?\" and Esther responded with \"If it " +
                    "pleases the king, let the king, together with Haman, come " +
                    "today to a banquet I have prepared for him.\"",
                audioResId = R.raw.esther_scene_06_narration
            )
        ),
        StoryPage(
            id = 7,
            title = "The Feast and the Truth",
            videoResId = R.raw.esther_scene_07,
            narration = Narration(
                text = "Esther invited the King and Haman to a special banquet. " +
                    "There, she bravely revealed her secret: \"My people and I " +
                    "have been sold to be destroyed!\" When the King asked who " +
                    "would do such a thing, Esther declared, \"The adversary and " +
                    "enemy is this wicked Haman!\"",
                audioResId = R.raw.esther_scene_07_narration
            )
        ),
        StoryPage(
            id = 8,
            title = "Deliverance and Celebration",
            videoResId = R.raw.esther_scene_08,
            narration = Narration(
                text = "The King stopped Haman's evil plan and issued a new " +
                    "decree allowing the Jewish people to protect themselves. " +
                    "Sorrow turned into joy, and mourning into a day of " +
                    "celebration! God used Esther's courage to save her entire " +
                    "nation.",
                audioResId = R.raw.esther_scene_08_narration
            )
        )
    )
}
