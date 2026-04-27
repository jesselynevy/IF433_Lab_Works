package oop_00000113854_JesselynVaniaAngelie.testing

class Dosen(nama: String, val nidn: String): Pegawai(nama){
    override fun bekerja(){
        println("$nama sedang menyiapkan materi kuliah")
    }

    fun mengajar(){
        println("$nama mengajar")
    }
}