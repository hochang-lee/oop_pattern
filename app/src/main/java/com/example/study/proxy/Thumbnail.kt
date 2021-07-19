package com.example.study.proxy

import android.util.Log

interface Thumbnail {
    fun showTitle()
    fun showPreview()
}

class RealThumbnail(_title : String, _movieUrl : String) : Thumbnail{
    private var title = _title
    private var movieUrl = _movieUrl

    init {
        Log.e("RealThumbnail","$movieUrl 의 영상 다운중")
    }

    override fun showTitle() {
        Log.e("RealThumbnail", "제목 :  $title")
    }

    override fun showPreview() {
        Log.e("RealThumbnail", "$title 의 프리뷰 재생")
    }
}

class ProxyThumbnail(_title : String, _movieUrl : String) : Thumbnail{
    private var title = _title
    private var movieUrl = _movieUrl
    private var realThumbnail : RealThumbnail? = null

    override fun showTitle() {
        Log.e("ProxyThumbnail",  "제목 :  $title")
    }

    override fun showPreview() {
        if(realThumbnail==null){
            realThumbnail = RealThumbnail(title,movieUrl)
        }
        realThumbnail!!.showPreview()
    }

}