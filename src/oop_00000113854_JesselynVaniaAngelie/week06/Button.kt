package oop_00000113854_JesselynVaniaAngelie.week06

class Button (override val name: String) : Clickable{
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}