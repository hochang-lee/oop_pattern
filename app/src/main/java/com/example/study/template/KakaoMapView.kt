package com.example.study.template

import android.util.Log

class KakaoMapView : MapView() {
    override fun connectMapServer() {
        Log.e("KakaoMapView","connectMapServer")
    }

    override fun showMapOnScreen() {
        Log.e("KakaoMapView","showMapOnScreen")
    }

    override fun moveToCurrentLocation() {
        Log.e("KakaoMapView","moveToCurrentLocation")
    }
}