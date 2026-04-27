package oop_00000113854_JesselynVaniaAngelie.trial

import java.text.SimpleDateFormat
import java.util.Date

class Transaction(
    val plant: Plant,
    var buyerName: String,
    var quantity: Int,
    val type: String
){
    val transactionId: String = "TRX-${System.currentTimeMillis().toString().takeLast(6)}"
    val transactionDate: String = SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Date())

    fun displayInfo() {
        println("==================================================")
        println("ID Transaksi : $transactionId")
        println("Tanggal      : $transactionDate")
        println("Tipe         : $type")
        println("Tanaman      : ${plant.name}")
        println("Pembeli/Titip: $buyerName")
        println("Jumlah       : $quantity unit")
        println("Harga Satuan : Rp ${plant.price}")
        println("Total        : Rp ${plant.price * quantity}")
        println("==================================================")
    }

    fun editInfo(newBuyerName: String, newQuantity: Int) {
        buyerName = newBuyerName
        quantity = newQuantity
    }
}