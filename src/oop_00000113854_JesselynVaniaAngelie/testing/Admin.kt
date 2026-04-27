package oop_00000113854_JesselynVaniaAngelie.testing

class Admin(nama: String): Pegawai(nama){
    override fun bekerja(){
        println("$nama sedang duduk depan komputer")
    }
    fun doAdminWork(){
        println("$nama sedang merekap data")
    }
}