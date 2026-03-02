package oop_00000113854_JesselynVaniaAngelie.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}