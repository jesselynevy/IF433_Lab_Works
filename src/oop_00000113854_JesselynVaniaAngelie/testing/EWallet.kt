//package oop_00000113854_JesselynVaniaAngelie.testing
//
//class EWallet(accountName:String, var balance: Double): PaymentMethod(accountName) {
//    override fun processPayment(amount: Double){
//        if(balance >= amount){
//            balance -= amount
//            println("Sukses bayar dengan e-wallet sebesar $amount")
//        } else{
//            println("Saldo tidak cukup")
//        }
//    }
//    fun topUp(amount: Double){
//        if(amount > 0){
//            balance += amount
//            println("Topup berhasil $amount")
//        } else {
//            println("Tidak boleh negatif")
//        }
//    }
//}