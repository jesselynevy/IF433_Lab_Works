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

    val acInverter = run {
        val device = SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
        device
    }
    homeDevices.add(acInverter)
    homeDevices.add(SmartDevice(
        "Picolo's Auto Feeder",
        "Pet Care",
        true,
        10
    ))

    val searchResult = homeDevices.find{
        it.category == "Camera"
    }

    searchResult?.let{
        it.diagnose()
        println(it)
    }
}