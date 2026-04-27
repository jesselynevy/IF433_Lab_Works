package oop_00000113854_JesselynVaniaAngelie.testing

object DatabaseManager {
    var connectionStatus: String = "Disconnected"
    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}