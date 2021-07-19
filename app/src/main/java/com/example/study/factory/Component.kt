package com.example.study.factory

import android.util.Log

abstract class Component {
    init {
        Log.e("component","name : ${getName()}")
    }
    protected abstract fun getName() : String
}


class LightButton : Component(){
    override fun getName() : String{
        return "LightButton"
    }
}
class DarkButton : Component(){
    override fun getName() : String{
        return "DarkButton"
    }
}


class LightSwitch : Component(){
    override fun getName() : String{
        return "LightSwitch"
    }
}
class DarkSwitch : Component(){
    override fun getName() : String{
        return "DarkSwitch"
    }
}


class LightDropdown : Component(){
    override fun getName() : String{
        return "LightDropdown"
    }
}
class DarkDropdown : Component(){
    override fun getName() : String{
        return "DarkDropdown"
    }
}
