package oop_00000113854_JesselynVaniaAngelie.week07

class NetworkClient private constructor(val url: String){
    fun connect() {
        println("Connecting to $url...")
    }
}