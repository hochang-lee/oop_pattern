package com.example.study.command

class RobotKit {
    private val robot : Robot = Robot()
    private val commands : MutableList<Command> = mutableListOf()
    fun addCommand(_command: Command){
        commands.add(_command)
    }
    fun start(){
        for (command in commands){
            command.robot = robot
            command.execute()
        }
    }
}