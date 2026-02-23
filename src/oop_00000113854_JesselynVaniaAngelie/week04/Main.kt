package oop_00000113854_JesselynVaniaAngelie.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di-override
    myCar.accelerate() // Memanggil gabungan method Parent dan Child

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar("BYD", 4, 100)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Manager ---")
    val manager1 = Manager("Jesselyn", 15000000)
    manager1.work()
    println("Bonus Manager: Rp ${manager1.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer1 = Developer("Vania", 12000000, "Typescript")
    developer1.work()
    println("Bonus Developer: Rp ${developer1.calculateBonus()}")
}