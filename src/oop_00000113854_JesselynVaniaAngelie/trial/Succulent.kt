package oop_00000113854_JesselynVaniaAngelie.trial

class Succulent(
    id: String,
    name: String,
    price: Int,
    stock: Int,
    waterRetention: String
) : Plant(id, name, price, stock) {
    private var waterRetention: String = ""
    fun getWaterRetention() = waterRetention
    fun setWaterRetention(newWaterRetention: String) {
        waterRetention = newWaterRetention
    }
    fun cekPerawatan(){
        println("Cek perawatan $name")
        val info = when(waterRetention){
            "Tinggi" -> "Siram SANGAT JARANG (2-4 minggu sekali). Kelebihan air bisa membunuh tanaman ini!"
            "Sedang" -> "Siram seminggu sekali. Pastikan tanah kering sebelum disiram lagi"
            "Rendah" -> "Siram setiap 2-3 hari. Tanaman ini butuh lebih banyak air dari succulent biasa."
            else -> "Informasi perawatan tidak tersedia."
        }
        println(info)
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Kategori Succulent")
        println("Water Retention: $waterRetention")
    }
}
