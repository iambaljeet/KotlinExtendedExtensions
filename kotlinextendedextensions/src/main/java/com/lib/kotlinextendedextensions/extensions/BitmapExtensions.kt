package com.lib.kotlinextendedextensions.extensions

import android.content.ContentResolver
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Base64
import java.io.ByteArrayOutputStream

//Converts a bitmap to Base64 String and returns the result
fun Bitmap.getBase64(imageQuality: Int? = 100): String? {
    val byteArrayOutputStream = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.JPEG, imageQuality ?: 100, byteArrayOutputStream)
    val byteArray = byteArrayOutputStream.toByteArray()
    return Base64.encodeToString(byteArray, Base64.DEFAULT)
}

//Create and return a bitmap from given image URI
fun Uri.getBitmapFromUri(contentResolver: ContentResolver?): Bitmap? {
    val imageStream = contentResolver?.openInputStream(this)
    return BitmapFactory.decodeStream(imageStream)
}

//Returns aspect ratio of a given Bitmap
fun Bitmap.getAspectRatio(): Float {
    return width.toFloat() / height.toFloat()
}

//Creates and returns a resized bitmap using given height and width
fun Bitmap.createResizedBitmap(width: Int, height: Int): Bitmap? {
    return Bitmap.createScaledBitmap(this, width, height, false)
}