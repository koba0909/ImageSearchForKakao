plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.kotlin.android)
}

android {
	namespace = "com.koba.data"

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
}

dependencies {
	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.androidx.core.ktx)

	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.kotlinx.serialization.json)
}