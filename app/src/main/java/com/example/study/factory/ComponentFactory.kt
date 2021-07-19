package com.example.study.factory


enum class Usage{
    PRESS,TOGGLE,EXPAND
}

abstract class Factory{
    abstract fun getCom(_usage: Usage) : Component
}

class LightFactory : Factory() {
    override fun getCom(_usage: Usage) : Component {
        when(_usage){
            Usage.PRESS->{
                return LightButton()
            }
            Usage.TOGGLE->{
                return LightSwitch()
            }
            Usage.EXPAND->{
                return LightDropdown()
            }
        }
    }
}

class DarkFactory : Factory() {
    override fun getCom(_usage: Usage) : Component {
        when(_usage){
            Usage.PRESS->{
                return DarkButton()
            }
            Usage.TOGGLE->{
                return DarkSwitch()
            }
            Usage.EXPAND->{
                return DarkDropdown()
            }
        }
    }
}