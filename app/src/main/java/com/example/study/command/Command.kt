package com.example.study.command

abstract class Command {
    lateinit var robot : Robot
    abstract fun execute()
}


class MoveForwardCommand(_space : Int) : Command() {
    var space = _space
    override fun execute() {
        robot.moveForward(space)
    }
}

class TurnCommand(_direction : Robot.Direction) : Command(){
    var direction  = _direction
    override fun execute() {
        robot.turn(direction)
    }
}

class PickupCommand : Command(){
    override fun execute() {
        robot.pickup()
    }
}