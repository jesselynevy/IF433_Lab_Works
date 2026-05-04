package oop_00000113854_JesselynVaniaAngelie.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("", "").apply{
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        homeDevices.add(it)
        println("(LOG) Kamera terhubung")
    }
}