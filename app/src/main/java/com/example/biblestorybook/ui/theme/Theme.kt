package com.example.biblestorybook.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val StorybookColorScheme = darkColorScheme(
    primary = Gold40,
    secondary = Brown80,
    tertiary = Parchment80,
    background = Brown40,
    surface = Brown40
)

@Composable
fun BibleStorybookTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = StorybookColorScheme,
        typography = Typography,
        content = content
    )
}
