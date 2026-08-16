package com.example.biblestorybook.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblestorybook.model.Story
import com.example.biblestorybook.story.StoryLibrary
import com.example.biblestorybook.ui.theme.Brown40
import com.example.biblestorybook.ui.theme.Gold40

/**
 * Landing screen: lets the child pick which story to play. Renders
 * whatever [StoryLibrary.stories] currently contains, so a new story only
 * needs a [StoryLibrary] entry to show up here.
 */
@Composable
fun StorySelectionScreen(
    onStorySelected: (Story) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Brown40)
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Bible Storybook",
            color = Gold40,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        StoryLibrary.stories.forEach { story ->
            StoryCard(story = story, onClick = { onStorySelected(story) })
        }
    }
}

@Composable
private fun StoryCard(
    story: Story,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = story.title,
            color = Gold40,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Button(onClick = onClick) {
            Text("Play")
        }
    }
}
