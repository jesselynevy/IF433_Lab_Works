package oop_00000113854_JesselynVaniaAngelie.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "Porsi kibble harus lebih dari 0 gr"
    }
    if(isJammed)
        throw DispenserJamException()

    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50

    try{
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException){
        println(e.message)
    } catch (e: FoodEmptyException){
        println(e.message)
    } catch (e: Exception){
        println("Unknown error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selseai.")
    }

    val result: Result<Int> = runCatching {
        dispenseKibble(30, 1000, false)
    }.onSuccess {
        newStock -> currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock")
    }.onFailure {
        error -> println("Peringatan ke Pemilik: ${error.message}")
        println("Berikan chicken jerky secara manual")
    }

    println("Final Stok: $currentKibbleStock")
}