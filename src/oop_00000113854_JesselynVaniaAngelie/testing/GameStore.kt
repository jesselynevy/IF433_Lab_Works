package oop_00000113854_JesselynVaniaAngelie.testing

fun main(){
    val gameTitle: String = "Zuma"
    val price: Int = 54000
    val userNote: String? = null
    val finalPrice = calculateDiscount(price)

    printReceipt(gameTitle, finalPrice, userNote)
}

fun calculateDiscount(price: Int) = if(price > 500000) price-(price * 20/100) else price-(price * 10/100)
fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("$title, $finalPrice, ${userNote?.length ?: "Tidak ada catatan"}")
}