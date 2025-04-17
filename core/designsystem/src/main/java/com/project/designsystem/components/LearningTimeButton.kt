package com.project.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.designsystem.ui.theme.LearningTimeTheme

@Composable
fun LearningTimeButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LearningTimeTheme.shapes.m),
    containerColor: Color = LearningTimeTheme.colors.primary,
    contentColor: Color = LearningTimeTheme.colors.neutral100,
    text: String,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor
        )
    ) {
        LearningTimeText(
            text = text,
            color = contentColor
        )
    }
}

@Composable
fun LearningTimeOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LearningTimeTheme.shapes.m),
    border: BorderStroke = BorderStroke(
        width = 1.dp,
        color = LearningTimeTheme.colors.primary
    ),
    contentColor: Color = LearningTimeTheme.colors.neutral00,
    text: String
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        border = border
    ) {
        LearningTimeText(
            text = text,
            color = contentColor
        )
    }
}

@Preview
@Composable
private fun LearningTimeButtonPreview() {
    Column {
        LearningTimeButton(
            onClick = {},
            text = "button"
        )

        LearningTimeButton(
            onClick = {},
            text = "shape large button",
            shape = RoundedCornerShape(LearningTimeTheme.shapes.l)
        )

        LearningTimeButton(
            onClick = {},
            text = "fill max width button",
            modifier = Modifier.fillMaxWidth(),
            containerColor = LearningTimeTheme.colors.secondary
        )

        LearningTimeOutlinedButton(
            onClick = {},
            text = "outlined button"
        )

        LearningTimeOutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(LearningTimeTheme.shapes.l),
            text = "shape large outlined button"
        )
    }
}