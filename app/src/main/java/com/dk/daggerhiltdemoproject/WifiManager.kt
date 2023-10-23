package com.dk.daggerhiltdemoproject

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class WifiManager @Inject constructor(private val wifiSettings: WifiSettings){
    fun init(){
        wifiSettings.connect()
    }

    fun message(){
        wifiSettings.sendByt()
    }
}

class WifiSettings @Inject constructor(){
    fun connect(){
        Log.d(TAG, "Connected")
    }

    fun sendByt(){
        Log.d(TAG, "Message send")
    }
}