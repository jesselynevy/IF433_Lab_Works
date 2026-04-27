//package oop_00000113854_JesselynVaniaAngelie.testing
//
//class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName){
//    override fun processPayment(amount: Double) {
//        if(usedAmount+amount <= limit){
//            usedAmount += amount
//            println("Transaksi Credit Card sebesar $amount berhasil. Total terpakai: $usedAmount")
//        } else{
//            println("Transaksi ditolak: Melebihi limit kartu")
//        }
//    }
//}