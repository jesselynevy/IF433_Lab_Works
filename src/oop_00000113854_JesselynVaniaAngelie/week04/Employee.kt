package oop_00000113854_JesselynVaniaAngelie.week04

open class Employee (val name: String, val baseSalary: Int){
    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary*10)/100
    }
}