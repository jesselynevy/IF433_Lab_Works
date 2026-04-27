package oop_00000113854_JesselynVaniaAngelie.trial

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
        val s1 = Student("Rini", "00001", "Informatika", 3.5)  // A
        val s2 = Student("Doni", "123")                           // B - secondary
        val s3 = Student("Budi", "ABCDE")                         // C - secondary

        s3.gpa = 1.5

        println(s1.getStatus())     // D
        println(s2.major)           // E
        println(s3.getStatus())     // F
        s1.displayInfo()            // G
    val plants: MutableList<Plant> = mutableListOf(
        IndoorPlant("IP001", "Peace Lily", 75000, 10, "Rendah"),
        IndoorPlant("IP002", "Snake Planet", 85000, 15, "Rendah"),
        OutdoorPlant("OP001", "Mawar Merah", 50000, 8, "Partial", 1),
        OutdoorPlant("OP002", "Anggrek Bulan", 150000, 5, "Partial", 3),
        Succulent("SC001", "Kaktus Bola", 35000, 20, "Tinggi"),
        Succulent("SC002", "Lidah Buaya", 25000, 12, "Tinggi")
    )

    val transactions: MutableList<Transaction> = mutableListOf()
    fun findPlant(id: String): Plant? = plants.find {
        it.id == id
    }
    var running = true
    while(running){
        println("===== SELAMAT DATANG DI FLORAMART =====")
        println("1. Lihat Daftar Tanaman")
        println("2. Beli Tanaman")
        println("3. Titip Tanaman")
        println("4. Lihat Semua Transaksi")
        println("5. Tambah Tanaman Baru")
        println("6. Tambah Stok Tanaman")
        println("0. Keluar")
        println("Pilihan Anda: ")
        var choose = scanner.nextInt()
        scanner.nextLine()
        when (choose) {
            1 -> {
                println("Daftar Tanaman Floramart")
                if(plants.isEmpty()){
                    println("Belum ada tanaman")
                }else{
                    plants.forEach { it.displayInfo() }
                }
            }
            2 -> {
                println("Beli Tanaman")
                print("Masukkan ID Tanaman: ")
                val id = scanner.nextLine()
                val plant = findPlant(id)
                if(plant == null){
                    println("ERROR Tanaman dengan ID $id tidak ditemukan")
                } else{
                    plant.displayInfo()
                    print("Nama Pembeli: ")
                    val buyerName = scanner.nextLine()
                    print("Jumlah yang ingin dibeli: ")
                    try{
                        val qty = scanner.nextInt()
                        scanner.nextLine()
                        if(qty <= 0){
                            println("Error jumlah harus lebih dari 0")
                        } else if(qty > plant.stock){
                            println("Error stok tidak mencukupi, stok tersedia: ${plant.stock}")
                        } else {
                            plant.kurangStok(qty)
                            val trx = Transaction(plant, buyerName, qty, "Beli")
                            transactions.add(trx)
                            println("Pembelian Berhasil")
                            println("Total Pembayaran: Rp ${plant.price * qty}")
                            println("ID Transaksi: ${trx.transactionId}")
                        }
                    } catch(e: NumberFormatException){
                        println("ERROR: Input tidak valid")
                    }
                }
            }
            3 -> {
                print("Masukkan ID Tanaman: ")
                val id = scanner.nextLine()
                val plant = findPlant(id)
                if(plant == null){
                    println("ERROR")
                } else {
                    plant.displayInfo()
                    print("Nama Penitip: ")
                    val titipName = scanner.nextLine()
                    print("Jumlah tanaman yang dititip")
                    try{
                        val qty = scanner.nextInt()
                        scanner.nextLine()
                        if(qty <= 0){
                            println("Error jumlah harus lebih dari 0")
                        } else {
                            plant.tambahStok(qty)
                            val trx = Transaction(plant, titipName, qty, "Titip")
                            transactions.add(trx)
                            println("Penitipan Berhasil ID Transaksi ${trx.transactionId}")
                        }
                    } catch(e: NumberFormatException){
                        println("ERROR: Input tidak valid")
                    }
                }

            }
            4 -> {
                println("RIWAYAT TRANSAKSI")
                if(transactions.isEmpty()){
                    println("Belum ada transaksi")
                } else {
                    println("Total transaksi = ${transactions.size}")
                    transactions.forEach{it.displayInfo()}
                }
            }
            5 -> {
                print("Masukkan ID tanaman: ")
                val id = scanner.nextLine()
                print("Nama Tanaman: ")
                val name = scanner.nextLine()
                print("Harga: ")
                val price = try{scanner.nextInt()} catch(e: NumberFormatException){0}
                scanner.nextLine()
                print("Stock: ")
                val stock = try{scanner.nextInt()} catch(e: NumberFormatException){0}
                scanner.nextLine()

                println("Tipe: 1=Indoor, 2=Outdoor, 3=Succulent")
                print("Pilih Tipe: ")
                val tipe = scanner.nextInt()
                scanner.nextLine()
                when(tipe){
                    1 -> {
                        print("Light level (Rendah/Sedang/Tinggi): ")
                        val ll = scanner.nextLine().trim()
                        plants.add(IndoorPlant(id, name, price, stock, ll))
                        println("✓ Indoor plant '$name' berhasil ditambahkan!")
                    }
                    2 -> {
                        print("Sun exposure (Penuh/Partial/Teduh): ")
                        val se = scanner.nextLine().trim()
                        print("Frekuensi siram (hari): ")
                        val wf = try { scanner.nextInt() } catch (e: Exception) { 1 }
                        scanner.nextLine()
                        plants.add(OutdoorPlant(id, name, price, stock, se, wf))
                        println("✓ Outdoor plant '$name' berhasil ditambahkan!")
                    }
                    3 -> {
                        print("Water Retention (Tinggi/Sedang/Rendah): ")
                        val wr = scanner.nextLine().trim()
                        plants.add(Succulent(id, name, price, stock, wr))
                        println("Succulent berhasil ditambahkan!")
                    }
                    else -> {
                        println("Tipe tidak valid")
                    }
                }
            }
            6 -> {
                println("Masukkan id tanaman: ")
                val id = scanner.nextLine()
                val plant = findPlant(id)
                if(plant == null){
                    println("Error plant tidak ada")
                } else{
                    print("Jumlah stok yang mau ditambah: ")
                    try{
                        val qty = scanner.nextInt()
                        scanner.nextLine()
                        plant.tambahStok(qty)
                    } catch (e: NumberFormatException) {
                        println("ERROR input tidak valid")
                    }
                }

            }
            0 -> {
                println("Terima kasih")
                running = false
            }
            else -> {
                println("PILIHAN TIDAK VALID")
            }
        }
    }
}