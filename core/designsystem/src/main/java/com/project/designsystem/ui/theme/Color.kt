package com.project.designsystem.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

val PrimaryLight = Color(0xFFFADA7A)
val SecondaryLight = Color(0xFFB1F0F7)

val Neutral00Light = Color(0xFF000000)
val Neutral10Light = Color(0xFF1A1A1A)
val Neutral20Light = Color(0xFF333333)
val Neutral30Light = Color(0xFF4D4D4D)
val Neutral40Light = Color(0xFF666666)
val Neutral50Light = Color(0xFF808080)
val Neutral60Light = Color(0xFF999999)
val Neutral70Light = Color(0xFFB3B3B3)
val Neutral80Light = Color(0xFFCCCCCC)
val Neutral90Light = Color(0xFFE6E6E6)
val Neutral100Light = Color(0xFFFFFFFF)

val SubPrimaryLight = Color(0xFFFCE7AA)
val SubSecondaryLight = Color(0xFFD6EFF6)

val WarningLight = Color(0xFFEF2B2A)
val InfoLight = Color(0xFF067DFD)

val Green30Light = Color(0xFF148518)
val Green40Light = Color(0xFF1BB120)
val Green50Light = Color(0xFF22DD28)
val Green60Light = Color(0xFF4EE453)
val Green70Light = Color(0xFF7AEB7E)
val Green80Light = Color(0xFFA7F1A9)
val Green90Light = Color(0xFFD3F8D4)


val PrimaryDark = Color(0xFFE3C15E)
val SecondaryDark = Color(0xFF89C9D1)

val Neutral00Dark = Color(0xFFFFFFFF)
val Neutral10Dark = Color(0xFFE6E6E6)
val Neutral20Dark = Color(0xFFCCCCCC)
val Neutral30Dark = Color(0xFFB3B3B3)
val Neutral40Dark = Color(0xFF999999)
val Neutral50Dark = Color(0xFF808080)
val Neutral60Dark = Color(0xFF666666)
val Neutral70Dark = Color(0xFF4D4D4D)
val Neutral80Dark = Color(0xFF333333)
val Neutral90Dark = Color(0xFF1A1A1A)
val Neutral100Dark = Color(0xFF000000)

val SubPrimaryDark = Color(0xFFC8B07D)
val SubSecondaryDark = Color(0xFFA7C9CF)

val WarningDark = Color(0xFFD12A29)
val InfoDark = Color(0xFF056ACC)

val Green30Dark = Color(0xFF196F1C)
val Green40Dark = Color(0xFF1F8F22)
val Green50Dark = Color(0xFF26AA2B)
val Green60Dark = Color(0xFF4AC34F)
val Green70Dark = Color(0xFF74CC79)
val Green80Dark = Color(0xFFA1D5A4)
val Green90Dark = Color(0xFFCDEDD1)

class LearningTimeColors(
    primary: Color,
    secondary: Color,
    neutral10: Color,
    neutral20: Color,
    neutral30: Color,
    neutral40: Color,
    neutral50: Color,
    neutral60: Color,
    neutral70: Color,
    neutral80: Color,
    neutral90: Color,
    neutral100: Color,
    subPrimary: Color,
    subSecondary: Color,
    warning: Color,
    info: Color,
    green30: Color,
    green40: Color,
    green50: Color,
    green60: Color,
    green70: Color,
    green80: Color,
    green90: Color
) {
    var primary by mutableStateOf(primary)
        private set
    var secondary by mutableStateOf(secondary)
        private set
    var neutral10 by mutableStateOf(neutral10)
        private set
    var neutral20 by mutableStateOf(neutral20)
        private set
    var neutral30 by mutableStateOf(neutral30)
        private set
    var neutral40 by mutableStateOf(neutral40)
        private set
    var neutral50 by mutableStateOf(neutral50)
        private set
    var neutral60 by mutableStateOf(neutral60)
        private set
    var neutral70 by mutableStateOf(neutral70)
        private set
    var neutral80 by mutableStateOf(neutral80)
        private set
    var neutral90 by mutableStateOf(neutral90)
        private set
    var neutral100 by mutableStateOf(neutral100)
        private set
    var subPrimary by mutableStateOf(subPrimary)
        private set
    var subSecondary by mutableStateOf(subSecondary)
        private set
    var warning by mutableStateOf(warning)
        private set
    var info by mutableStateOf(info)
        private set
    var green30 by mutableStateOf(green30)
        private set
    var green40 by mutableStateOf(green40)
        private set
    var green50 by mutableStateOf(green50)
        private set
    var green60 by mutableStateOf(green60)
        private set
    var green70 by mutableStateOf(green70)
        private set
    var green80 by mutableStateOf(green80)
        private set
    var green90 by mutableStateOf(green90)
        private set

    fun update(other: LearningTimeColors) {
        primary = other.primary
        secondary = other.secondary
        neutral10 = other.neutral10
        neutral20 = other.neutral20
        neutral30 = other.neutral30
        neutral40 = other.neutral40
        neutral50 = other.neutral50
        neutral60 = other.neutral60
        neutral70 = other.neutral70
        neutral80 = other.neutral80
        neutral90 = other.neutral90
        neutral100 = other.neutral100
        subPrimary = other.subPrimary
        subSecondary = other.secondary
        warning = other.warning
        info = other.info
        green30 = other.green30
        green40 = other.green40
        green50 = other.green50
        green60 = other.green60
        green70 = other.green70
        green80 = other.green80
        green90 = other.green90
    }
}