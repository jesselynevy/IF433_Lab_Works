package oop_00000113854_JesselynVaniaAngelie.week14
import java.io.File

interface OrderRepository{
    fun saveOrder(fileName: File, itemName: String, finalPrice: Double)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

interface PricingStrategy{
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy{
    override fun calculate(price: Double): Double = price * 0.90
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price  // no discount
}

class CsvOrderRepository(): OrderRepository{
    override fun saveOrder(fileName: File, itemName: String, finalPrice: Double) {
        fileName.bufferedWriter().use{ writer ->
            writer.append("$itemName, $finalPrice\n")
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
    private val file = File("orders.csv")
    fun processOrder(strategy: PricingStrategy, itemName: String, basePrice: Double){
        val finalPrice = strategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(file, itemName, finalPrice)
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