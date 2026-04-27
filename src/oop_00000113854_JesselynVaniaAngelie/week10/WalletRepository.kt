package oop_00000113854_JesselynVaniaAngelie.week10

class WalletRepository<T: Any>{
    private val items = mutableListOf<T>()
    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items.toList()
    }
}

fun <T : Named> WalletRepository<T>.findByName(value: String): List<T> {
    return getAll().filter { it.name.contains(value, ignoreCase = true) }
}