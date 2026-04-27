package oop_00000113854_JesselynVaniaAngelie.trial

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5)
            println("WARNING: NIM $nim tidak valid!")
        else
            println("LOG: Student $name berhasil terdaftar.")
    }

    constructor(name: String, nim: String) : this(name, nim, "Undecided")

    fun getStatus() = when {
        gpa >= 2.0 -> "Aktif"
        gpa >= 1.0 -> "Percobaan"
        else       -> "Non-Aktif"
    }

    fun displayInfo() =
        println("Nama: $name | NIM: $nim | Jurusan: $major | GPA: $gpa | Status: ${getStatus()}")
}