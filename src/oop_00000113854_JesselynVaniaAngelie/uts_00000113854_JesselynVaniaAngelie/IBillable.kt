package uts_00000113854_JesselynVaniaAngelie

interface IBillable{
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}