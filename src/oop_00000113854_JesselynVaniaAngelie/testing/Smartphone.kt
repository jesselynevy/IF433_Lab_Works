package oop_00000113854_JesselynVaniaAngelie.testing

class Smartphone: Camera, Phone{
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Camera>.turnOn()
        println("OS berhasil booting")
    }
}