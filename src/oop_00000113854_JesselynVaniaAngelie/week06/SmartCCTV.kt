package oop_00000113854_JesselynVaniaAngelie.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name berhasil dinyalakan")
        startRecord()
    }
    override fun turnOff() {
        println("CCTV $name berhasil dimatikan")
        stopRecord()
    }
    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
    // stopRecord tidak wajib karena sudah ada default implementation di interface
}