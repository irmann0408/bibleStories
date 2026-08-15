package com.example.biblestorybook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.biblestorybook.story.DavidAndGoliathStory
import com.example.biblestorybook.ui.StoryBookScreen
import com.example.biblestorybook.ui.theme.BibleStorybookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BibleStorybookTheme {
                StoryBookScreen(pages = DavidAndGoliathStory.pages)
            }
        }
    }
}
