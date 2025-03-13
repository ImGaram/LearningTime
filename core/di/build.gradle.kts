plugins {
    alias(libs.plugins.learningtime.android.library)
}

android {
    namespace = "com.project.di"
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.domain)
}