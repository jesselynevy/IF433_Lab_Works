package oop_00000113854_JesselynVaniaAngelie.week14

class DiscountCalculator{
    fun calculator(price: Double, type: String): Double{
        return when (type){
            "student" -> price * 0.80
            "members" -> price * 0.85
            "employee" -> price * 0.70
            // Setiap ada diskon baru (misal: senior/VIP), class ini harus dimodifikasi!
            else -> price
        }
    }
}