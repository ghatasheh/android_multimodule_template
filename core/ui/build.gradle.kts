plugins {
    id("app.android.library")
    id("app.android.library.compose")
}

android {
    namespace = "android.template.core.ui"
}

dependencies {
    // Core Android dependencies
    implementation(libs.androidx.core.ktx)

    // Compose
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    // Tooling
    debugImplementation(libs.androidx.compose.ui.tooling)
}
