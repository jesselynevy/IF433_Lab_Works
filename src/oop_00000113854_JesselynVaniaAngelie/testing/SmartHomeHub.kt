package oop_00000113854_JesselynVaniaAngelie.testing

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice){
        devices.add(device)
    }
    fun turnOffAllSwitches(){
        for(device in devices){
            when(device){
                is Switchable -> {
                    device.turnOff()
                }
            }
        }
    }
    fun activateSecurityMode(){
        for(device in devices){
            when(device){
                is Recordable -> {
                    device.startRecord()
                }
                is SmartSpeaker -> {
                    device.playMusic("Sirine peringatan")
                }
            }
        }
    }
}