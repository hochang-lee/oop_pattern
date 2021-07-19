package com.example.study.mediator

class ModeMediator {
    private val listeners : MutableList<ModeListener> = mutableListOf()

    fun addListener(_modeListener: ModeListener){
        listeners.add(_modeListener)
    }

    fun onModeChange(_mode: Mode){
        for (listener in listeners){
            listener.onModeChange(_mode)
        }
    }

}