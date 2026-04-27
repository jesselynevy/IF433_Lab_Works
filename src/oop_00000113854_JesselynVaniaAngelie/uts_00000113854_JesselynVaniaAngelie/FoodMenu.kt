package uts_00000113854_JesselynVaniaAngelie

class FoodMenu(name: String, menuCode: String, basePrice: Double): CateringMenu(name, menuCode, basePrice) {
    val packagingFee: Double = 3000.0
    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }
    override fun printMenuDetails(quantity: Int) {
        println("Menu Details: Food Info")
        println("Food Info: $name - $menuCode")
        println("Quantity: $quantity")
        println("Subtotal: ${calculateSubtotal(quantity)}")
    }
}