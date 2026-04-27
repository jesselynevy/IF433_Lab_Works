package oop_00000113854_JesselynVaniaAngelie.testing

interface Clickable{
    val name: String
    fun click()
}
class Button(override val name: String) : Clickable {
    override fun click(){
        println("Button $name clicked")
    }
}