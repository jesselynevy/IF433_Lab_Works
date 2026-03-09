package oop_00000113854_JesselynVaniaAngelie.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name berhasil dinyalakan.")
    }
    override fun turnOff() {
        println("Speaker $name berhasil dimatikan.")
    }
    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify.")
    }
}