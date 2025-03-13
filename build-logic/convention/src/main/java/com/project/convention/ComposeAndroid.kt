package com.project.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureComposeAndroid() {
    androidExtension.apply {
        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("kotlin").get().toString()
        }

        dependencies {
            val bom = libs.findLibrary("androidx-compose-bom").get()
            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))

            "implementation"(libs.findLibrary("androidx.material3").get())
            "implementation"(libs.findLibrary("androidx-activity-compose").get())
            "implementation"(libs.findLibrary("androidx.ui").get())
            "implementation"(libs.findLibrary("androidx-ui-graphics").get())
            "implementation"(libs.findLibrary("androidx-ui-tooling-preview").get())
            "debugImplementation"(libs.findLibrary("androidx-ui-tooling").get())

            "androidTestImplementation"(libs.findLibrary("androidx-ui-test-junit4").get())
            "debugImplementation"(libs.findLibrary("androidx-ui-test-manifest").get())
        }
    }
}