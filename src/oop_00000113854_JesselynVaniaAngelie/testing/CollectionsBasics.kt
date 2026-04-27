package oop_00000113854_JesselynVaniaAngelie.testing

fun main(){
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // framewroks.add("Python") // UNCOMMENT INI AKAN ERROR!
    println("Immutable List: $frameworks")
    println(frameworks.get(2))

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    scores.removeAt(1)
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println(uniqueNumbers.contains(5))
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf( "User A", "User B" )
    activeUsers.add("User C")
    activeUsers.add("User A") // Diabaikan karena sudah ada
    println("Active USers: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Value boleh duplikat, Key tidak
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 // Menambah data baru
    inventory["Apples"] = 45 // Mengupdate data lama
    println("Inventory: $inventory")
}