pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "LearningTime"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
include(":common")

include(":feature:main")
include(":feature:timer")
include(":feature:mypage")

include(":core:data")
include(":core:domain")
include(":core:di")
include(":core:designsystem")
