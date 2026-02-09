package oop_00000113854_JesselynVaniaAngelie.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

//    println("--- APLIKASI PMB UMN ---")
//
//    print("Masukkan Nama: ")
//    val name = scanner.nextLine()
//
//    print("Masukkan NIM (Wajib 5 Karakter): ")
//    val nim =scanner.next()
//
//    scanner.nextLine() // Bersihkan buffer newline (Penyakit klasik Scanner)
//
//    // Validasi di sisi pemanggil (Main)
//    if (nim.length != 5){
//        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
//        // Program berhenti di sini untuk mahasiswa ini, tidak membuat objek
//    } else {
//        print("Masukkan Jurusan: ")
//        val major = scanner.nextLine()
//
//        // Instansiasi Objek karena data sudah aman
//        val s1 = Student(name, nim, major)
//        println("${s1.name}, ${s1.nim}, ${s1.major}, ${s1.gpa}")
//        println("Status: Pendaftaran Selesai.")
//
//        // ... After validation
//        print("Pilih Jalur (1. Reguler, 2. Umum): ")
//        val type = scanner.nextInt()
//        scanner.nextLine() // Consume newLine
//
//        if (type == 1) {
//            print("Masukkan Jurusan: ")
//            val major = scanner.nextLine()
//            // Memanggil Primary Constructor
//            val s1 = Student(name, nim, major)
//            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
//        } else if (type == 2) {
//            // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
//            val s2 = Student(name, nim)
//            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
//        } else {
//            println("Pilihan tidak tepat, pendaftaran batal")
//        }
//    }
//    print("Masukkan Judul: ")
//    val bookTitle = scanner.nextLine()
//
//    print("Masukkan Peminjam: ")
//    val borrower = scanner.nextLine()
//
//    print("Masukkan Lama Pinjam (hari): ")
//    var loanDuration = scanner.nextInt()
//
//    if (loanDuration < 0){
//        loanDuration = 1
//    }
//
//    val loan1 = Loan(bookTitle, borrower, loanDuration)
//    println("\n=== Detail Peminjaman ===")
//    println("Judul Buku   : ${loan1.bookTitle}")
//    println("Peminjam    : ${loan1.borrower}")
//    println("Lama Pinjam : ${loan1.loanDuration} hari")
//    println("Total Denda : Rp ${loan1.calculateFine()}")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val Hero1 = Hero(name, baseDamage)
    var enemyHp = 100

    while(Hero1.isAlive() && enemyHp > 0){
        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()
        when (choice) {
            1 -> {
                enemyHp -= Hero1.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("${Hero1.name} menyerang musuh!")
                println("HP Musuh sekarang: $enemyHp")

                if(enemyHp > 0){
                    val enemyDamage = (10..20).random()
                    println("Musuh membalas dengan damage $enemyDamage!")
                    Hero1.takeDamage(enemyDamage)
                    println("HP ${Hero1.name} sekarang: ${Hero1.hp}")
                }
            }
            2 -> {
                println("${Hero1.name} kabur dari pertarungan!")
                break
            }
            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }
    println("\n=== HASIL PERTARUNGAN ===")
    when {
        Hero1.isAlive() && enemyHp <= 0 -> println("${Hero1.name} MENANG!")
        !Hero1.isAlive() && enemyHp > 0 -> println("Musuh MENANG!")
        else -> println("Pertarungan berakhir tanpa pemenang.")
    }
}
