plugins {
	alias(libs.plugins.android.library)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.kotlin.kapt)
}

android {
	namespace = "com.koba.search"
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
	implementation(project(":core:base"))
	implementation(project(":core:domain"))

	implementation(libs.androidx.constraintlayout)
	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.androidx.appcompat)
	implementation(libs.androidx.lifecycle.viewmodel.ktx)
	implementation(libs.androidx.fragment.ktx)
	implementation(libs.hilt)
	kapt(libs.hilt.compiler)
}