package oop_00000113854_JesselynVaniaAngelie.week03

fun main() {
    // Tutorial
//    val e = Employee("Budi")
//
//    e.salary = -1000
//    e.salary = 5000000
//    println("Gaji: ${e.salary}")
//
//    e.increasePerformance()
//
//    println("Pajak yang harus dibayar: ${e.tax}")

    // Task 01
//    val weapon = Weapon("Dragon Slayer")
//    weapon.damage = -50
//    println("Damage sekarang: ${weapon.damage}")
//    println("Tier sekarang: ${weapon.tier}")
//    weapon.damage = 9999
//    println("Damage sekarang: ${weapon.damage}")
//    println("Tier sekarang: ${weapon.tier}")

    // Task 02
    val player = Player("Jesselyn")

    // Ini harus error karena xp private
    // println(player.xp)

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}