package com.example.study.decorator

import android.util.Log

abstract class FighterDecorator(_fighter : Fighter) : Fighter {
    private var fighter : Fighter = _fighter

    override fun attack() {
        fighter.attack()
    }
}