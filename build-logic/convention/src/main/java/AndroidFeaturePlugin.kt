import com.project.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

internal class AndroidFeaturePlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "learningtime.android.library")
            apply(plugin = "learningtime.compose.library")
            apply(plugin = "learningtime.hilt")
            apply(plugin = "learningtime.room")

            dependencies {
                "implementation"(project(":core:designsystem"))
                "implementation"(project(":core:domain"))

                // junit
                "testImplementation"(libs.findLibrary("junit").get())
                "androidTestImplementation"(libs.findLibrary("androidx.junit").get())
                "androidTestImplementation"(libs.findLibrary("androidx.espresso.core").get())

                // truth
                "testImplementation"(libs.findLibrary("truth").get())
            }
        }
    }
}