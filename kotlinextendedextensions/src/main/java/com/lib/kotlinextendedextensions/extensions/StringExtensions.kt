package com.lib.kotlinextendedextensions.extensions

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import androidx.core.util.PatternsCompat

//Converts given Base64 String to Bitmap
fun String.base64ToBitmap(): Bitmap? {
    val imageByteArray: ByteArray = Base64.decode(this, Base64.DEFAULT)
    return BitmapFactory.decodeByteArray(imageByteArray, 0, imageByteArray.size)
}

//Check if given string is valid Email or not
fun String.isValidEmail(): Boolean {
    val pattern = PatternsCompat.EMAIL_ADDRESS
    return pattern.matcher(this).matches()
}

//Check if given string is valid URL or not
fun String.isValidUrl(): Boolean {
    val pattern = PatternsCompat.WEB_URL
    return pattern.matcher(this).matches()
}


//Check if given string is valid URL or not
fun String.isValidIpAddress(): Boolean {
    val pattern = PatternsCompat.IP_ADDRESS
    return pattern.matcher(this).matches()
}