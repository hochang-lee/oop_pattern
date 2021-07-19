package com.example.study.command

import android.util.Log

class Robot {
    enum class Direction { LEFT, RIGHT }
    fun moveForward (space : Int){
        Log.e("Robot","${space}칸 전진")
    }
    fun turn(_direction : Direction){
        var result = ""
        result = if(_direction==Direction.LEFT){
            "왼쪽"
        }else{
            "오른쪽"
        }
        Log.e("Robot","${result}으로 방향 전환")
    }
    fun pickup(){
        Log.e("Robot","물건 집어 들기")
    }
}