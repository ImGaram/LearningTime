plugins {
    alias(libs.plugins.learningtime.android.library)
    alias(libs.plugins.learningtime.hilt)
}

android {
    namespace = "com.project.domain"
}

dependencies {
    implementation(projects.core.data)
}
