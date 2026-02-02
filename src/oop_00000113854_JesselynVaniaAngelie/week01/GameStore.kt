package oop_00000113854_JesselynVaniaAngelie.week01

fun main () {
    val gameTitle: String = "Genshin Impact"
    val price: Int = 670000
    val finalPrice = calculateDiscount(price)

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }
    //if using "when"
    //when {
    //    price > 500_000 -> price - (price * 20 / 100)
    //    else -> price - (price * 10 / 100)
    //}

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("*** SteamKW Receipt ***")
    println("Game Title  : $title")
    println("Final Price: Rp $finalPrice")
    println("User Note: ${userNote ?: "Tidak ada catatan"}")
    println("=======================")
}