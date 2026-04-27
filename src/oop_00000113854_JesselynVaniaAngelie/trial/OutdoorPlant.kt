package oop_00000113854_JesselynVaniaAngelie.trial

import jdk.jfr.Frequency

class OutdoorPlant(
    id: String,
    name: String,
    price: Int,
    stock: Int,
    sunExposure: String,
    waterFrequency: Int
) : Plant(id, name, price, stock) {
    private var sunExposure: String = ""
    private var waterFrequency: Int = 0

    fun getSunExposure() = sunExposure
    fun setSunExposure(newSunExposure: String) {
        sunExposure = newSunExposure
    }
    fun getWaterFrequency() = waterFrequency
    fun setWaterFrequency(newWaterFrequency: Int) {
        waterFrequency = newWaterFrequency
    }

    fun tampilkanPerawatan(){
        println("Info Perawatan $name")
        val info = when{
            waterFrequency <= 1 -> "Setiap hari"
            waterFrequency <= 3 -> "2-3 hari sekali ($waterFrequency hari)"
            else -> "Jarang disiram (setiap $waterFrequency hari)"
        }
        println("Frekuensi Penyiraman: $info")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Kategori Outdoor")
        println("Sun Exposure: $sunExposure")
        println("Water Frequency : $waterFrequency")
    }
}