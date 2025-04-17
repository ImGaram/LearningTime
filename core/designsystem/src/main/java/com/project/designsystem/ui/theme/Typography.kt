package com.project.designsystem.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.project.designsystem.R

val suit = FontFamily(
    Font(R.font.suit_bold, FontWeight.Bold),
    Font(R.font.suit_extrabold, FontWeight.ExtraBold),
    Font(R.font.suit_extralight, FontWeight.ExtraLight),
    Font(R.font.suit_light, FontWeight.Light),
    Font(R.font.suit_medium, FontWeight.Medium),
    Font(R.font.suit_regular, FontWeight.Normal),
    Font(R.font.suit_semibold, FontWeight.SemiBold),
    Font(R.font.suit_thin, FontWeight.Thin)
)

data class LearningTimeTypography(
    val bold24: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    val semiBold24: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    val bold20: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    val medium20: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    val normal20: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    val medium18: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    val normal18: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    val medium16: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    val normal16: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    val medium14: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    val normal14: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    val normal12: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    val light12: TextStyle = TextStyle(
        fontFamily = suit,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )
)