plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = libs.plugins.learningtime.android.application.get().pluginId
            implementationClass = "AndroidApplicationPlugin"
        }
        register("androidFeature") {
            id = libs.plugins.learningtime.android.feature.get().pluginId
            implementationClass = "AndroidFeaturePlugin"
        }
        register("androidLibrary") {
            id = libs.plugins.learningtime.android.library.get().pluginId
            implementationClass = "AndroidLibraryPlugin"
        }
        register("composeApplication") {
            id = libs.plugins.learningtime.compose.application.get().pluginId
            implementationClass = "ComposeApplicationPlugin"
        }
        register("hilt") {
            id = libs.plugins.learningtime.hilt.get().pluginId
            implementationClass = "HiltPlugin"
        }
        register("room") {
            id = libs.plugins.learningtime.room.get().pluginId
            implementationClass = "RoomPlugin"
        }
        register("kotlinJvm") {
            id = libs.plugins.learningtime.kotlin.jvm.get().pluginId
            implementationClass = "KotlinJvmPlugin"
        }
    }
}