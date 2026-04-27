package oop_00000113854_JesselynVaniaAngelie.testing

class SmartCCTV (
    override val id: String,
    override val name: String,
): SmartDevice, Switchable, Recordable{
    override fun turnOn() {
        println("smartCCTV $id turn on")
        startRecord()
    }

    override fun turnOff() {
        println("smartCCTV $id turn off")
        stopRecord()
    }

    override fun startRecord() {
        println("smartCCTV $id start recording")
    }
}