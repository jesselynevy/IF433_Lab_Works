package oop_00000113854_JesselynVaniaAngelie.week02

class Hero (
    val name: String,
    var hp : Int,
    var baseDamage : Int
){
    constructor(name: String, baseDamage: Int): this(name, 100, baseDamage)
    fun attack(targetName: String){
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if(hp < 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}