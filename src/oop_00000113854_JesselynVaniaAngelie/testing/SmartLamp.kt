package oop_00000113854_JesselynVaniaAngelie.testing

class SmartLamp(
    override val id: String,
    override val name: String
): SmartDevice, Switchable{
    override fun turnOn() {
        println("smartlamp $name menyala")
    }
    override fun turnOff() {
        println("smartlamp $name mati")
    }
}