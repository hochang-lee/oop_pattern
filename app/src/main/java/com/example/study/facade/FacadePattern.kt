package com.example.study.facade

class FacadePattern {
    fun refreshData(){
        val url = StringConverter().convertToUrl("naver.com")
        val internetConnection = InternetConnection()
        internetConnection.connect()
        val data = internetConnection.getData(url)
        internetConnection.disconnect()
        Updater().update(data)
    }
}