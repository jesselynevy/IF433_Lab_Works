package uts_00000113854_JesselynVaniaAngelie

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return if (isLargeSize) {
            (basePrice + 5000) * quantity
        } else {
            basePrice * quantity
        }
    }

    override fun printMenuDetails(quantity: Int) {
        println("Drink Info")
        println()
        println("Drink Info: $name - $menuCode")
        println("Size: ${checkLarge(isLargeSize)}")
        println("Quantity: $quantity")
        println("Subtotal: ${calculateSubtotal(quantity)}")
    }
    fun checkLarge(isLarge: Boolean) = if(isLarge) "Large" else "Normal"
}