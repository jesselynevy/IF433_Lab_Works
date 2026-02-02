package oop_00000113854_JesselynVaniaAngelie.week01

fun main () {
    val gameTitle: String = "Genshin Impact"
    val price: Int = 670000
    val finalPrice = calculateDiscount(price)

    println("Game Title: $gameTitle, Price: $price")
    println("Original Price: Rp $price")
    println("Final Price: Rp $finalPrice")
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