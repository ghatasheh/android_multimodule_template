plugins {
    id("app.android.library")
    id("app.android.hilt")
}

android {
    namespace = "android.template.core.testing"
}

dependencies {

    implementation(libs.androidx.test.runner)
    implementation(libs.hilt.android.testing)
}
