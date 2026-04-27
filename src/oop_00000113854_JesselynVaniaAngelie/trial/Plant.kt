package oop_00000113854_JesselynVaniaAngelie.trial

open class Plant(
    val id: String,
    val name: String,
    var price: Int,
    var stock: Int
){
    fun tambahStok(jumlah: Int){
        if(jumlah <= 0){
            println("Error cannot be 0 or less")
        }
        stock += jumlah
    }

    fun kurangStok(jumlah: Int){
        if(jumlah > stock) {
            println("Error stock is insufficient")
        }
        if(jumlah <= 0){
            println("Error cannot be 0 or less")
        }
        stock -= jumlah
    }

    open fun displayInfo(){
        println("ID: $id")
        println("Name: $name")
        println("Price: $price")
        println("Stock: $stock")
    }
}