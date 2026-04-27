package oop_00000113854_JesselynVaniaAngelie.uts_00000113854_JesselynVaniaAngelie

import uts_00000113854_JesselynVaniaAngelie.CateringMenu
import uts_00000113854_JesselynVaniaAngelie.CateringOrder
import uts_00000113854_JesselynVaniaAngelie.Customer
import uts_00000113854_JesselynVaniaAngelie.DrinkMenu
import uts_00000113854_JesselynVaniaAngelie.FoodMenu
import uts_00000113854_JesselynVaniaAngelie.OrderStatus
import java.util.Scanner

fun main() {
    println("=== UMN CATERING MANAGER SYSTEM ===")

    // PHASE 1: Pre-load Menu Database
    println("[Database Setup] Adding Nasi Goreng Spesial...")
    val nasiGoreng = FoodMenu("Nasi Goreng Spesial", "nsg01", 0.0)
    nasiGoreng.basePrice = -15000.0
    nasiGoreng.basePrice = 25000.0
    println("[Database Setup] Price updated to Rp ${nasiGoreng.basePrice}")

    val ayamBakar = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val esTehLemon = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, isLargeSize = true)

    val menuCatalog: List<CateringMenu> = listOf(nasiGoreng, ayamBakar, esTehLemon)

    // PHASE 2: Live Customer Input
    println()
    println("--- CUSTOMER DATA INPUT ---")
    val scanner = Scanner(System.`in`)

    print("Enter Customer Name: ")
    val customerName = scanner.nextLine()
    print("Enter Phone Number: ")
    val phoneNumber = scanner.nextLine()
    print("Enter Delivery Address: ")
    val deliveryAddress = scanner.nextLine()

    val customer = Customer(customerName, phoneNumber, deliveryAddress)
    val order = CateringOrder(customer)

    // PHASE 3: Live Order Input Loop
    var ordering = true
    while (ordering) {
        println()
        println("--- MENU CATALOG ---")
        menuCatalog.forEachIndexed { index, menu ->
            println("${index + 1}. ${menu.name}")
        }
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val menuChoice = scanner.nextLine().trim().toIntOrNull() ?: -1

        if (menuChoice == 0) {
            println("Processing Checkout...")
            ordering = false
        } else if (menuChoice in 1..menuCatalog.size) {
            print("Enter Quantity: ")
            val qty = scanner.nextLine().trim().toIntOrNull() ?: 1
            order.addMenuToOrder(menuCatalog[menuChoice - 1], qty)
            println("Order successfully added!")
        } else {
            println("Invalid menu number. Please try again.")
        }
    }

    // PHASE 4: Print Invoice
    println()
    order.status = OrderStatus.COOKING
    order.printInvoice()

    scanner.close()
}