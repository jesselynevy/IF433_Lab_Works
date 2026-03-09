package oop_00000113854_JesselynVaniaAngelie.week06

class SmartLamp (override val id: String, override val name: String): SmartDevice, Switchable{
    override fun turnOn() {
        println("Lampu $name berhasil dinyalakan.")
    }
    override fun turnOff() {
        println("Lampu $name berhasil dimatikan.")
    }
}