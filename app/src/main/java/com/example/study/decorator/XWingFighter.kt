package com.example.study.decorator

import android.util.Log

class XWingFighter : Fighter {
    override fun attack() {
        Log.e("XWingFighter", "탄환 발사")
    }
}