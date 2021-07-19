package com.example.study.template

import android.util.Log

class NaverMapView : MapView() {
    override fun connectMapServer() {
        Log.e("NaverMapView","connectMapServer")
    }

    override fun showMapOnScreen() {
        Log.e("NaverMapView","showMapOnScreen")
    }

    override fun moveToCurrentLocation() {
        Log.e("NaverMapView","moveToCurrentLocation")
    }
}