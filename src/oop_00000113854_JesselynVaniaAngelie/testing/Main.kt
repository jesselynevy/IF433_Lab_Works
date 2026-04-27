package oop_00000113854_JesselynVaniaAngelie.testing

import oop_00000113854_JesselynVaniaAngelie.week04.Developer
import oop_00000113854_JesselynVaniaAngelie.week04.Manager
import oop_00000113854_JesselynVaniaAngelie.week06.SmartCCTV
import oop_00000113854_JesselynVaniaAngelie.week06.SmartHomeHub
import oop_00000113854_JesselynVaniaAngelie.week06.SmartLamp
import oop_00000113854_JesselynVaniaAngelie.week06.SmartSpeaker
import oop_00000113854_JesselynVaniaAngelie.week07.processEvent
import java.util.Scanner
//fun processCheckout(method: PaymentMethod, amount: Double){
//    println("Mulai checkout")
//    method.pay(amount)
//}

fun main() {
//    println("Status: ${DatabaseManager.connectionStatus}")
//    DatabaseManager.connect()
//    println("Status: ${DatabaseManager.connectionStatus}")
//
//    val client = NetworkClient.createClient()
//    client.connect()
//
//    val reg1 = RegularUser("Jesselyn", 12)
//    val reg2 = RegularUser("Jesselyn", 12)
//    println(reg1)
//    println(reg2)
//    println("Sama? ${reg1 === reg2}")
//
//    val data1 = DataUser("Jesselyn", 12)
//    val data2 = DataUser("Jesselyn", 12)
//    println(data1)
//    println(data2)
//    println("Sama? ${data1 == data2}")
//
//    val data3 = data1.copy(name = "Lol")
//    println("Hasil: $data3")
//    val (name, age) = data1
//    println("Destructured: $name berumur $age")
//
//    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")
//    val uiMessage = when(response) {
//        is ApiResponse.Success -> "Tampilkan: ${response.data}"
//        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
//        is ApiResponse.Loading -> "Tampilkan Spinner"
//    }
//    println(uiMessage)

//    GameManager.startGame()
//    GameManager.startGame()
//    println("${ItemRarity.LEGENDARY.dropChance}")
//    val myStarterSword = Weapon.forgeStarterSword()
//    println("Senjata Awal: ${myStarterSword.item.name} | Damage: ${myStarterSword.item.damage} | Rarity: ${myStarterSword.item.rarity} | Durability: ${myStarterSword.durability}")
//    val updateSword = myStarterSword.item.copy(damage = 25)
//
//    processEvent(BattleState.SafeZone)
//    processEvent(BattleState.MonsterEncounter("Akainu dan Big Mom"))
//    processEvent(BattleState.LootDropped(updateSword))
//    processEvent(BattleState.GameOver("Terkena jebakan racun"))

//    val livingRoomLamp = SmartLamp("L01", "Ruang Tamu")
//    val kitchenSpeaker = SmartSpeaker("S01", "Google Nest Dapur")
//    val garageCctv = SmartCCTV("C01", "Ezviz Garasi")
//
//    val hub = SmartHomeHub()
//    hub.addDevice(livingRoomLamp)
//    hub.addDevice(kitchenSpeaker)
//    hub.addDevice(garageCctv)
//
//    hub.activateSecurityMode()
//    hub.turnOffAllSwitches()

//    val myWatch = SmartWatch()
//    myWatch.showTime()
//
//    val myPhone = Smartphone()
//    myPhone.turnOn()
//
//    val pay1 = Gopay()
//    val pay2 = CreditCard()
//
//    println("testing")
//    processCheckout(pay1, 50000.0)
//    processCheckout(pay2, 150000.0)
//    val myWallet = EWallet("jess", 50000.0)
//    val myCreditCard = CreditCard("jess", 100000.0)
//    val metodes: List<PaymentMethod> = listOf(myWallet, myCreditCard)
//    for(metode in metodes){
//        metode.processPayment(75000.0)
//        when(metode){
//            is EWallet -> {
//                metode.topUp(50000.0)
//                metode.processPayment(75000.0)
//            }
//            is CreditCard -> {
//                println("Menggunakan Credit Card, tidak perlu top up.")
//            }
//        }
//    }

//    val luas = MathHelper()
//    println("circle: ${luas.hitungLuas(4.5)}")
//    println("square: ${luas.hitungLuas(4)}")
//    println("rectangle: ${luas.hitungLuas(4, 5)}")
//    val dosen1 = Dosen("Pak Alex", "0123456")
//    val admin1 = Admin("Bu Siti")
//
//    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
//    println("===Aktivitas Pegawai===")
//    for(pegawai in daftarPegawai){
//        pegawai.bekerja()
//        when(pegawai){
//            is Dosen -> {
//                println("Terdeteksi sebagai Dosen ${pegawai.nidn}")
//                pegawai.mengajar()
//            }
//            is Admin -> {
//                println("Terdeteksi sebagai Admin ${pegawai.nama}")
//                pegawai.doAdminWork()
//            }
//        }
//    }

//    println("Testing Vehicle")
//    val generalVehicle = Vehicle("Sepeda Onthel")
//    generalVehicle.honk()
//    generalVehicle.accelerate()
//
//    println("\nTesting Car")
//    val myCar = Car("Toyota", 4)
//    myCar.openTrunk()
//    myCar.honk()
//    myCar.accelerate()
//
//    println("\nTesting Electric Car")
//    val myElectricCar = ElectricCar("Tesla", 4, 87)
//    myElectricCar.openTrunk()
//    myElectricCar.accelerate()
//    myElectricCar.honk()
//
//    println("\n--- Testing Manager ---")
//    val manager1 = Manager("Jesselyn", 15000000)
//    manager1.work()
//    println("Bonus Manager: Rp ${manager1.calculateBonus()}")
//
//    println("\n--- Testing Developer ---")
//    val developer1 = Developer("Vania", 12000000, "Typescript")
//    developer1.work()
//    println("Bonus Developer: Rp ${developer1.calculateBonus()}")

//    val e = Employee("Budi")
//    e.salary = -1000
//    e.salary = 5000000
//    println("Gaji: ${e.salary}")
//    e.increasePerformance()
//    println("Pajak yang harus dibayar: ${e.tax}")
//
//    val weap1 = Weapon("sword")
//    weap1.damage = -50
//    val weap2 = Weapon("swork")
//    weap2.damage = 5000
//    println("Tier1: ${weap1.tier}")
//    println("Tier2: ${weap2.tier}")
//
//    val player1 = Player("lol")
//    player1.addXp(50)
//    println("Level sekarang: ${player1.level}")
//    player1.addXp(60)
//    println("Level sekarang: ${player1.level}")

//    val scanner = Scanner(System.`in`)
//    println("nama hero: ")
//    val name = scanner.nextLine()
//    println("base damage: ")
//    var baseDamage = scanner.nextInt()
//    var enemyHp = 100
//    val hero1 = Hero(name, baseDamage)
//    while(hero1.isAlive() && enemyHp > 0){
//        print("Menu: 1. Serang 2. Kabur")
//        val type = scanner.nextInt()
//        when (type){
//            1 -> {
//                enemyHp -= baseDamage
//                if(enemyHp < 0) enemyHp = 0
//                println("sisa hp musuh ${enemyHp}")
//                if(enemyHp > 0){
//                    hero1.takeDamage((10..20).random())
//                    println("musuh balas")
//                    println("sisa hp hero ${hero1.hp}")
//                }
//            }
//            2 -> {
//                println("kabur")
//                break
//            }
//            else ->
//                println("tidak valid")
//        }
//    }
//    println("\n=== HASIL PERTARUNGAN ===")
//    when {
//        hero1.isAlive() && enemyHp <= 0 -> println("${hero1.name} MENANG!")
//        !hero1.isAlive() && enemyHp > 0 -> println("Musuh MENANG!")
//        else -> println("Pertarungan berakhir tanpa pemenang.")
//    }
//    println("Masukkan judul buku: ")
//    val title = scanner.nextLine()
//    println("Masukkan peminjam: ")
//    val peminjam = scanner.nextLine()
//    println("Masukkan lama pinjam: ")
//    var lama = scanner.nextInt()
//    if(lama < 0){
//        lama = 1
//    }
//
//    val loan1 = Loan(title, peminjam, lama)
//    println("\n=== Detail Peminjaman ===")
//    println("Judul Buku   : ${loan1.bookTitle}")
//    println("Peminjam    : ${loan1.borrower}")
//    println("Lama Pinjam : ${loan1.loanDuration} hari")
//    println("Total Denda : Rp ${loan1.calculateFine()}")
//    println("--- APLIKASI PMB UMN ---")
//
//    println("Masukkan nama: ")
//    val name = scanner.nextLine()
//
//    print("Masukkan NIM (Wajib 5 Karakter): ")
//    val nim = scanner.nextLine()
//
//    if(nim.length != 5){
//        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
//    } else {
//        print("Pilih Jalur (1. reguler 2. Umum): ")
//        val type = scanner.nextInt()
//        scanner.nextLine()
//
//        if(type == 1){
//            print("Masukkan Jurusan: ")
//            val major = scanner.nextLine()
//            val s1 = Student(name, nim, major)
//            println("Terdaftar di: ${s1.major} dengan GPA awal : ${s1.gpa}")
//        } else if(type == 2) {
//            val s2 = Student(name, nim)
//            println("Terdaftar di ${s2.major} dengan GPA awal : ${s2.gpa}")
//        } else{
//            println("Pilihan ngawur, pendaftaran batal!")
//        }
//    }
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let {
        price -> val tax = price * 0.11
        "Transaksi Valid. Harga Rp $price, Pajak: Rp $tax"
    } ?: "Transaksi Invalid. Harga belum diset!"

    println(receipt)

    println("=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData){
        val text = item as? String
        text?.let{
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("=== TEST THE RED BUTTON ===")
    val toxicData: String? = null
    try{
        val length = toxicData!!.length
    } catch(e: NullPointerException){
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan")
    }

    val apiResponse : Map<String, String?> = mapOf("status" to "200", "token" to null)
    try{
        val token1 = requireNotNull(apiResponse["token"]){
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server"
        }
    } catch(e: IllegalArgumentException){
        println(e.message)
    }

    println("== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (Length: $statusLength)")
}