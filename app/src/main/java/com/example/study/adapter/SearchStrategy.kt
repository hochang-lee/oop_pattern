package com.example.study.adapter

import android.util.Log

interface SearchStrategy {
    fun search()
}

class SearchAll : SearchStrategy{
    override fun search() {
        Log.e("search","All")
    }
}
class SearchImage : SearchStrategy{
    override fun search() {
        Log.e("search","Image")
    }
}

class SearchNews : SearchStrategy{
    override fun search() {
        Log.e("search","News")
    }
}

class SearchMaps : SearchStrategy{
    override fun search() {
        Log.e("search","Maps")
    }
}

class SearchFindAdapter(_findAlgorithm: FindAlgorithm) : SearchStrategy{
    private var findAlgorithm = _findAlgorithm

    override fun search() {
        findAlgorithm.find(true)
    }
}

