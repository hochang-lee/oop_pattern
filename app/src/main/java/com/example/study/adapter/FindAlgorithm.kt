package com.example.study.adapter

import android.util.Log

interface FindAlgorithm {
    fun find(global : Boolean)
}

class FindMovieAlgorithm : FindAlgorithm{
    override fun find(global: Boolean) {
        Log.e("FindMovieAlgorithm","find")
    }
}