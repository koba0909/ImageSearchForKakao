plugins {
	alias(libs.plugins.android.library)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.kotlin.kapt)
}

android {
	namespace = "com.koba.base"
	compileSdk = libs.versions.compileSdk.get().toInt()

	buildFeatures {
		dataBinding = true
	}

	defaultConfig {
		minSdk = libs.versions.minSdk.get().toInt()
		targetSdk = libs.versions.targetSdk.get().toInt()
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
}

dependencies {
	implementation(libs.androidx.appcompat)
	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.androidx.core.ktx)
}