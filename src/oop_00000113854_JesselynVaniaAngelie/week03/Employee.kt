package oop_00000113854_JesselynVaniaAngelie.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            // Kita memanggil setter di dalam setter (Recursive)
            this.salary = value
        }
}