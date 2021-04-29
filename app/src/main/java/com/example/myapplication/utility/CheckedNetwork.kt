package com.example.myapplication.utility

import android.content.Context
import android.net.ConnectivityManager
import androidx.core.content.ContextCompat.getSystemService

class CheckedNetwork(val context: Context) {

    fun  isNetworkAvailbale():Boolean{
        val conManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val internetInfo = conManager.activeNetworkInfo
        return internetInfo!=null && internetInfo.isConnected
    }

}