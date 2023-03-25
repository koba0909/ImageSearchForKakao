plugins {
	alias(libs.plugins.android.library)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.kotlin.kapt)
	alias(libs.plugins.kotlin.serialization)
}

android {
	namespace = "com.koba.data_implement"
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
	implementation(project(":core:data"))
	implementation(project(":core:network"))
	implementation(libs.bundles.kotlinx.serialization)
	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.androidx.core.ktx)
	implementation(libs.hilt)
	implementation(libs.retrofit)
	kapt(libs.hilt.compiler)
}