package oop_00000113854_JesselynVaniaAngelie.testing

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil dengan $brand dengan $numberOfDoors pintu dibuka")
    }
    override fun honk(){
        println("TIN TIN! Mobil $brand lewat!")
    }
    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan tranmisi gigi untuk menambah kecepatan")
    }
}