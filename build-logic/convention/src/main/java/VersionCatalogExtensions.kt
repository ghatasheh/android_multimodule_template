import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

val VersionCatalog.minSdk: Int
    get() = findVersion("minSdk").get().requiredVersion.toInt()

val VersionCatalog.targetsdk: Int
    get() = findVersion("targetSdk").get().requiredVersion.toInt()

val VersionCatalog.compileSdk: Int
    get() = findVersion("targetSdk").get().requiredVersion.toInt()

val Project.vcLibs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
