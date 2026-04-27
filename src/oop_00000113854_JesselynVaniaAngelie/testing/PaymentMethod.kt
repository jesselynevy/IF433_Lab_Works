package oop_00000113854_JesselynVaniaAngelie.testing
/*
    abstract class PaymentMethod(
        val accountName: String
    ){
        abstract fun processPayment(amount: Double)
    }
*/

interface PaymentMethod{
    fun pay(amount: Double)
}