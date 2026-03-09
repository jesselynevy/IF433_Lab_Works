package oop_00000113854_JesselynVaniaAngelie.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun turnOffAllSwitches(){
        for (device in devices) {
            when (device) {
                is Switchable -> { device.turnOff() }
            }
        }
    }
}


// bisa pake if
// if (device is Switchable) {
//     device.turnOff()
// }