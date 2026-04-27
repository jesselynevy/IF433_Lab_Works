package oop_00000113854_JesselynVaniaAngelie.testing

class Gopay : PaymentMethod{
    override fun pay(amount: Double){
        println("$amount via gopay")
    }
}

class CreditCard : PaymentMethod{
    override fun pay(amount: Double){
        println("$amount via creditcard")
    }
}