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

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Jesselyn", 28)
    val data2 = DataUser("Jesselyn", 28)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // ERROR: 'when' expression must be exhaustive
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // Task
    GameManager.startGame()
    GameManager.startGame()
    println("Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")
    val myStarterSword = Weapon.forgeStarterSword()
    println("Senjata Awal: ${myStarterSword.item.name} | Damage: ${myStarterSword.item.damage} | Rarity: ${myStarterSword.item.rarity} | Durability: ${myStarterSword.durability}")
}