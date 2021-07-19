package com.example.study.decorator

import android.util.Log

class PlasmaDecorator(_fighter : Fighter) : FighterDecorator(_fighter){
    override fun attack() {
        super.attack()
        Log.e("PlasmaDecorator", "플라즈마 발사")
    }
}