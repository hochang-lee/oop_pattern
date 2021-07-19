package com.example.study.composite

import android.util.Log

interface FileSystem{
    fun getSize():Int
    fun remove()
}

class File(private val name : String, private val size : Int) : FileSystem{
    override fun getSize(): Int {
        Log.e("File : $name", "size : $size")
        return size
    }

    override fun remove() {
        Log.e("File : $name", "delete")
    }

}

class Folder(private val name : String) : FileSystem{
    private val includeds : MutableList<FileSystem> = mutableListOf()

    fun add(_fileSystem: FileSystem){
        includeds.add(_fileSystem)
    }

    override fun getSize(): Int {
        var total = 0
        for (included in includeds){
            total += included.getSize()
        }
        Log.e("Folder : $name", "size : $total")
        Log.e("-----","-----")
        return total
    }

    override fun remove() {
        for(included in includeds){
            included.remove()
        }
        Log.e("Folder : $name", "delete")
        Log.e("-----","-----")
    }

}