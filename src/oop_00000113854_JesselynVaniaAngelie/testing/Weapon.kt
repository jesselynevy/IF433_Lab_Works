//package oop_00000113854_JesselynVaniaAngelie.testing
//
//class Weapon(
//    val name: String
//){
//    var damage: Int = 0
//        set(value) {
//            if(value < 0){
//                println("Tidak boleh negatif")
//            } else if(value > 1000){
//                field = 1000
//            } else {
//                field = value
//            }
//        }
//    val tier: String
//        get() = when{
//            damage > 800 -> "Legendary"
//            damage > 500 -> "Epic"
//            else -> "Common"
//        }
//}