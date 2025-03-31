package com.project.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.project.designsystem.ui.theme.LearningTimeTheme

@Composable
fun LearningTimeText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LearningTimeTheme.typography.normal14,
    color: Color = LearningTimeTheme.colors.neutral00
) {
    Text(
        text = text,
        modifier = modifier,
        style = style,
        color = color
    )
}

@Preview
@Composable
private fun LearningTimeTextPreview() {
    LearningTimeText(
        text = "test"
    )
}