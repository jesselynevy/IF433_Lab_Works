package uts_00000113854_JesselynVaniaAngelie

class CateringOrder (val customer: Customer){
    var status: OrderStatus = OrderStatus.WAITING_LIST
    private var orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()
    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
    }
    fun printInvoice() {
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")
        println()

        var grandTotal = 0.0
        orderItems.forEachIndexed { index, (menu, qty) ->
            print("${index + 1}.")
            menu.printMenuDetails(qty)
            grandTotal += menu.calculateSubtotal(qty)
        }

        println("-----------------------------------------")
        println("GRAND TOTAL: Rp $grandTotal")
        println("=========================================")
    }
}

