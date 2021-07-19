package com.example.study.facade

import android.util.Log

class StringConverter{
    fun convertToUrl(str : String): String {
        val url ="http://$str"
        Log.e("convertToUrl",url)
        return url
    }
}

class InternetConnection{
    fun connect(){
        Log.e("InternetConnection","connect")
    }
    fun getData(url : String): String {
        Log.e("InternetConnection","getData")
        return "data"
    }
    fun disconnect(){
        Log.e("InternetConnection","disconnect")
    }
}

class Updater{
    fun update(date : String){
        Log.e("Updater","update")
    }
}