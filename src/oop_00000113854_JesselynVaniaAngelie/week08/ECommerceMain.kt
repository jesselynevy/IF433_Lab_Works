package oop_00000113854_JesselynVaniaAngelie.week08

fun main(){
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )
    val parser = ApiParser()
    for(raw in rawApiData){
        try{
            val parsedData: Product? = parser.parseProduct(raw)
            parsedData?.let{
                product -> parser.checkout(product)
                when(product){
                    is Product.Clothing -> {
                        println("Clothing Product ID: ${product.id}, ${product.name}(Size ${product.size})")
                    }
                    is Product.Electronic -> {
                        println("Electronic Product ID: ${product.id}, ${product.name}(Warranty ${product.warrantyMonths})")
                    }
                }
            }

        } catch(e: IllegalArgumentException){
            println("Error: ${e.message}")
        }
    }
}