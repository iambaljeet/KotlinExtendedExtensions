package com.lib.kotlinextendedextensions.extensions

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.net.ConnectivityManager
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.ContextCompat

//Shows toast for smaller duration
fun Context.showShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

//Shows toast for longer duration
fun Context.showLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

//Checks if internet is available or not
fun Context.isInternetAvailable(): Boolean {
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return activeNetworkInfo != null && activeNetworkInfo.isConnected
}

//Hides keyboard for a given view
fun Context.dismissKeyboard(view: View?) {
    view?.let{
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}

//Returns color from Color ID
fun Context.color(resId: Int) : Int {
    return ContextCompat.getColor(this, resId)
}

//Returns drawable from Drawable ID
fun Context.drawable(resId: Int) : Drawable? {
    return ContextCompat.getDrawable(this, resId)
}

//Returns colorStateList from given ID
fun Context.colorStateList(resId: Int) : ColorStateList? {
    return ContextCompat.getColorStateList(this, resId)
}

//Get system service from give service class
fun Context.systemService(serviceClass: Class<*>) : Any? {
    return ContextCompat.getSystemService(this, serviceClass)
}

//Get system service name from give service class
fun Context.systemServiceName(serviceClass: Class<*>) : Any? {
    return ContextCompat.getSystemServiceName(this, serviceClass)
}