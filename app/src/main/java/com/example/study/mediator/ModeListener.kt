package com.example.study.mediator

import android.util.Log


interface ModeListener{
    fun onModeChange(mode : Mode)
}

class ListView : ModeListener{
    override fun onModeChange(mode: Mode) {
        if(mode == Mode.LIST){
            Log.e("ListView","show")
        }else{
            Log.e("ListView","hide")
        }
    }
}

class GalleryView : ModeListener{
    override fun onModeChange(mode: Mode) {
        if(mode == Mode.GALLERY){
            Log.e("GalleryView","show")
        }else{
            Log.e("GalleryView","hide")
        }
    }
}


class DataDownloader : ModeListener{
    override fun onModeChange(mode: Mode) {
        if(mode == Mode.LIST){
            Log.e("ListView","downloader")
        }else{
            Log.e("GalleryView","downloader")
        }
    }
}