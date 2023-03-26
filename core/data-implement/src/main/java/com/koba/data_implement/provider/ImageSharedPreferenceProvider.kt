package com.koba.data_implement.provider

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImageSharedPreferenceProvider @Inject constructor(
    private val sharedPreferences: SharedPreferences,
) {
    fun setLong(key: String, value: Long) {
        sharedPreferences.edit().run {
            putLong(key, value)
            apply()
        }
    }

    fun remove(key: String) {
        sharedPreferences.edit().run {
            remove(key)
            apply()
        }
    }

    fun contain(key: String): Boolean {
        return sharedPreferences.contains(key)
    }

    fun getAll(): Map<String, Any?> = sharedPreferences.all.toMap()

    companion object {
        const val PREFERENCE_NAME = "search_image_preference"
    }
}
