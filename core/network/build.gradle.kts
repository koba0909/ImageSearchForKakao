plugins {
	alias(libs.plugins.android.library)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.kotlin.serialization)
	alias(libs.plugins.kotlin.kapt)
	alias(libs.plugins.dagger.hilt.android)
}

android {
	namespace = "com.koba.network"
	compileSdk = libs.versions.compileSdk.get().toInt()

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
	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.bundles.kotlinx.serialization)
	implementation(libs.okhttp)
	implementation(libs.retrofit)
	kapt(libs.hilt.compiler)
	implementation(libs.hilt)
}