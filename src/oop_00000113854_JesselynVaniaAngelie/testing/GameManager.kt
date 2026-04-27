package oop_00000113854_JesselynVaniaAngelie.testing

object GameManager {
    var isGameRunning : Boolean = false
    fun startGame(){
        if(isGameRunning){
            println("Game started! no duplicate")
        } else {
            isGameRunning = true
            println("Start Game Engine...")
        }
    }
}