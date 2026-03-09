package oop_00000113854_JesselynVaniaAngelie.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val livingRoomLamp = SmartLamp("L01", "Ruang Tamu")
    val kitchenSpeaker = SmartSpeaker("S01", "Google Nest Dapur")
    val garageCctv = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(livingRoomLamp)
    hub.addDevice(kitchenSpeaker)
    hub.addDevice(garageCctv)

    println("\n=== Mengaktifkan Security Mode ===")
    hub.activateSecurityMode()

    println()
    println("=== Mematikan Semua Perangkat Switchable ===")
    hub.turnOffAllSwitches()
}