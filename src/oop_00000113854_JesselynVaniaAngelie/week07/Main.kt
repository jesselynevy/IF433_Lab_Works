package oop_00000113854_JesselynVaniaAngelie.week07

fun main(){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Jesselyn", 28)
    val reg2 = RegularUser("Jesselyn", 28)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}")
}