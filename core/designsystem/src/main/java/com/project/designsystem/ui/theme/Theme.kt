package com.project.designsystem.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private val LearningTimeDarkColors = LearningTimeColors(
    primary = PrimaryDark,
    secondary = SecondaryDark,
    neutral00 = Neutral00Dark,
    neutral10 = Neutral10Dark,
    neutral20 = Neutral20Dark,
    neutral30 = Neutral30Dark,
    neutral40 = Neutral40Dark,
    neutral50 = Neutral50Dark,
    neutral60 = Neutral60Dark,
    neutral70 = Neutral70Dark,
    neutral80 = Neutral80Dark,
    neutral90 = Neutral90Dark,
    neutral100 = Neutral100Dark,
    subPrimary = SubPrimaryDark,
    subSecondary = SubSecondaryDark,
    warning = WarningDark,
    info = InfoDark,
    green30 = Green30Dark,
    green40 = Green40Dark,
    green50 = Green50Dark,
    green60 = Green60Dark,
    green70 = Green70Dark,
    green80 = Green80Dark,
    green90 = Green90Dark
)

private val LearningTimeLightColors = LearningTimeColors(
    primary = PrimaryLight,
    secondary = SecondaryLight,
    neutral00 = Neutral00Light,
    neutral10 = Neutral10Light,
    neutral20 = Neutral20Light,
    neutral30 = Neutral30Light,
    neutral40 = Neutral40Light,
    neutral50 = Neutral50Light,
    neutral60 = Neutral60Light,
    neutral70 = Neutral70Light,
    neutral80 = Neutral80Light,
    neutral90 = Neutral90Light,
    neutral100 = Neutral100Light,
    subPrimary = SubPrimaryLight,
    subSecondary = SubSecondaryLight,
    warning = WarningLight,
    info = InfoLight,
    green30 = Green30Light,
    green40 = Green40Light,
    green50 = Green50Light,
    green60 = Green60Light,
    green70 = Green70Light,
    green80 = Green80Light,
    green90 = Green90Light
)

@Composable
private fun ProvideLearningTimeTheme(
    colors: LearningTimeColors,
    typography: LearningTimeTypography,
    shapes: LearningTimeShapes,
    spaces: LearningTimeSpaces,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors }
    colorPalette.update(colors)

    CompositionLocalProvider(
        LocalColors provides colorPalette,
        LocalTypography provides typography,
        LocalShapes provides shapes,
        LocalSpaces provides spaces,
        content = content
    )
}

@Composable
fun LearningTimeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = remember {
        if (darkTheme) LearningTimeDarkColors else LearningTimeLightColors
    }

    ProvideLearningTimeTheme(
        colors = colors,
        typography = LearningTimeTheme.typography,
        shapes = LearningTimeTheme.shapes,
        spaces = LearningTimeTheme.spaces,
        content = content
    )
}

val LocalColors = staticCompositionLocalOf { LearningTimeLightColors }
val LocalTypography = staticCompositionLocalOf { LearningTimeTypography() }
val LocalShapes = staticCompositionLocalOf { LearningTimeShapes() }
val LocalSpaces = staticCompositionLocalOf { LearningTimeSpaces() }