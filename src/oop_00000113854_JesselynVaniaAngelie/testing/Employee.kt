package oop_00000113854_JesselynVaniaAngelie.testing

open class Employee(
    val name: String,
    val baseSalary: Int
){
    open fun work(){
        println("$name is working.")
    }
    open fun calculateBonus():Int{
        return baseSalary * 10/100
    }
}