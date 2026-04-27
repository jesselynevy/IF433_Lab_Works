package oop_00000113854_JesselynVaniaAngelie.trial

class IndoorPlant(
    id: String,
    name: String,
    price: Int,
    stock: Int,
    lightLevel : String
): Plant(id, name, price, stock){
    private var lightLevel: String = ""
    fun getLightLevel() = lightLevel
    fun setLightLevel(newLevel: String){
        lightLevel = newLevel
    }
    fun cekCahaya(){
        println("Info Cahaya: $name")
        val info = when(lightLevel){
            "Rendah" -> "Cocok untuk ruangan gelap kamar tidur, koridor, atau pojok ruangan."
            "Sedang" -> "Taruh dekat jendela dengan tirai. Hindari sinar langsung."
            "Tinggi" -> "Butuh sinar matahari langsung. Taruh di dekat jendela atau balkon."
            else -> "Informasi cahaya tidak tersedia."
        }
        println(info)
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Kategori Indoor")
        println("Light Level: $lightLevel")
    }
}