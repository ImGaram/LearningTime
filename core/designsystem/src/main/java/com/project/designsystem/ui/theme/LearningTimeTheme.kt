package com.project.designsystem.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object LearningTimeTheme {
    val colors: LearningTimeColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: LearningTimeTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: LearningTimeShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val spaces: LearningTimeSpaces
        @Composable
        @ReadOnlyComposable
        get() = LocalSpaces.current
}