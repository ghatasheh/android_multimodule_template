import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidHiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("com.google.devtools.ksp")
            }

            dependencies {
                "implementation"(vcLibs.findLibrary("hilt.android").get())
                "ksp"(vcLibs.findLibrary("hilt.compiler").get())
                // Hilt and instrumented tests.
                "androidTestImplementation"(vcLibs.findLibrary("hilt.android.testing").get())
                "kspAndroidTest"(vcLibs.findLibrary("hilt.android.compiler").get())
                // Hilt and Robolectric tests.
                "testImplementation"(vcLibs.findLibrary("hilt.android.testing").get())
                "kspTest"(vcLibs.findLibrary("hilt.android.compiler").get())
            }
        }
    }
}
