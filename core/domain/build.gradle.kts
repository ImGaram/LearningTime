plugins {
    alias(libs.plugins.learningtime.kotlin.jvm)
    alias(libs.plugins.learningtime.hilt)
}

dependencies {
    implementation(projects.core.data)
}
