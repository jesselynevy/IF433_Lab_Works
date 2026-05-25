package oop_00000113854_JesselynVaniaAngelie.week14
import java.io.File

interface OrderRepository{
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class CsvOrderRepository(): OrderRepository{
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File("orders.csv").bufferedWriter().use{ writer ->
            writer.append("$itemName, $finalPrice, $customerType\n")
        }
    }
}

class EmailNotifier(): NotificationService{
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
){
    fun processOrder(itemName: String, finalPrice: Double, customerType: String){
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

//class BadOrderProcessor {
//    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi + I/O + Notifikasi sekali
//    private val file = File("orders.csv")
//
//    fun processOrder(itemName: String, basePrice: Double, customerType: String){
//        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
//        val finalPrice = when(customerType){
//            "REGULAR" -> basePrice
//            "VIP" -> basePrice * 0.90
//            else -> basePrice
//        }
//
//        println("Memproses pesanan $itemName seharga $finalPrice")
//
//        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
//        file.appendText("$itemName, $finalPrice, $customerType\n")
//
//        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
//        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
//    }
//}