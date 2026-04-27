package oop_00000113854_JesselynVaniaAngelie.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intbox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}