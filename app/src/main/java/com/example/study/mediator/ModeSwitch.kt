package com.example.study.mediator

class ModeSwitch {
    var mode : Mode = Mode.LIST
    private var modeMediator : ModeMediator? = null


    fun setModeMediator(_modeMediator: ModeMediator){
        modeMediator = _modeMediator
    }

    fun toggleMode(){
        mode = if(mode==Mode.LIST){
            Mode.GALLERY
        }else{
            Mode.LIST
        }
        if(modeMediator != null){
            modeMediator!!.onModeChange(mode)
        }
    }

}


enum class Mode {LIST , GALLERY}