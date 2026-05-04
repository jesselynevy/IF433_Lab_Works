package oop_00000113854_JesselynVaniaAngelie.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let{
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length
    }
    println("Panjang nama: $length")

    println("=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run{
        println("Memproses kata: ${this}") // 'this' bisa fihilangkan (implicit)
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")
}