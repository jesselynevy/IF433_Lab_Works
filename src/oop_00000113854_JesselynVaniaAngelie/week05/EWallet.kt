package oop_00000113854_JesselynVaniaAngelie.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod (accountName){
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran dari EWallet sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top up berhasil. Saldo sekarang: $balance")
        } else {
            println("Jumlah top up tidak valid")
        }
    }
}