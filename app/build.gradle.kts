plugins {
    alias(libs.plugins.learningtime.android.application)
    alias(libs.plugins.learningtime.compose.application)
    alias(libs.plugins.learningtime.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.project.learningtime"
}

dependencies {
    implementation(projects.core.designsystem)
}