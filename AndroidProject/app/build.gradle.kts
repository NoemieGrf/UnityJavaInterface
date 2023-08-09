plugins {
    id("com.android.library")
}

android {
    namespace = "com.grf.aar"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    ndkVersion = "25.1.8937393"
    buildToolsVersion = "33.0.2"
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
}