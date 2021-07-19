package com.example.study.decorator

import android.util.Log

class LaserDecorator(_fighter : Fighter) : FighterDecorator(_fighter) {
    override fun attack() {
        super.attack()
        Log.e("LaserDecorator", "레이저 발사")
    }
}