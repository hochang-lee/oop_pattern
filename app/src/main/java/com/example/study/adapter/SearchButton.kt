package com.example.study.adapter

class SearchButton {
    private var searchStrategy : SearchStrategy = SearchAll()
    fun setSearchStrategy(_searchStrategy: SearchStrategy){
        searchStrategy = _searchStrategy
    }
    fun onClick(){
        searchStrategy.search()
    }
}