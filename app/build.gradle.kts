plugins {
    id("com.android.application")
}

android {
    namespace = "com.victorbnl.test"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.victorbnl.test"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        extra.set("enableCrashlytics", false)
    }
}
