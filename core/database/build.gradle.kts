plugins {
    id("app.android.library")
    id("app.android.hilt")
    id("app.android.room")
}

android {
    namespace = "android.template.core.database"

    defaultConfig {
        testInstrumentationRunner = "android.template.core.testing.HiltTestRunner"
    }
}

dependencies {
}
