package oop_00000113854_JesselynVaniaAngelie.testing

class SmartSpeaker(
    override val id: String,
    override val name: String
): SmartDevice, Switchable{
    override fun turnOn() {
        println("smartspeaker $id turn on")
    }
    override fun turnOff() {
        println("smartspeaker $id turn off")
    }
    fun playMusic(song: String){
        println("smartspeaker $id play music $song")
    }
}