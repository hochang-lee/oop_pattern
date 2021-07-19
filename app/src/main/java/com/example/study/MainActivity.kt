package com.example.study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.study.adapter.*
import com.example.study.composite.File
import com.example.study.composite.Folder
import com.example.study.decorator.LaserDecorator
import com.example.study.decorator.PlasmaDecorator
import com.example.study.decorator.XWingFighter
import com.example.study.facade.FacadePattern
import com.example.study.factory.*
import com.example.study.mediator.*
import com.example.study.proxy.ProxyThumbnail
import com.example.study.proxy.Thumbnail
import com.example.study.template.KakaoMapView
import com.example.study.template.NaverMapView

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val folder1 = Folder("폴더 1")
        folder1.add(File("파일1-1",300))
        folder1.add(File("파일1-2",320))
        folder1.add(File("파일1-3",350))
        val folder2 = Folder("폴더 2")
        folder2.add(File("파일2-1",200))
        folder2.add(File("파일2-2",150))
        folder2.add(File("파일2-3",190))

        folder1.add(folder2)
        folder1.getSize()

    }
}