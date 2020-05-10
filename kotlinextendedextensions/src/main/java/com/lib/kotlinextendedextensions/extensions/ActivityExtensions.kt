package com.lib.kotlinextendedextensions.extensions

import android.app.Activity
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatDelegate

//Apply Dark theme to app
fun applyDarkTheme() {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
}

//Apply Light theme to app
fun applyLightTheme() {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
}

//Apply system default theme to app
fun applySystemDefaultTheme() {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
}

//Returns screen width
fun Activity.screenWidth(): Int {
    val metrics: DisplayMetrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return metrics.widthPixels
}

//Returns screen height
fun Activity.screenHeight(): Int {
    val metrics: DisplayMetrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return metrics.heightPixels
}