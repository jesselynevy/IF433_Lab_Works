package oop_00000113854_JesselynVaniaAngelie.testing

class ApiParser{
    fun parseProduct(rawJson: Map<String, Any?>) : Product?{
        try{
            val id = requireNotNull(rawJson["id"] as? String){
               "API Invalid missing ID"
            }
            val name = requireNotNull(rawJson["name"] as? String){
                "API Invalid missing name"
            }
            val type = requireNotNull(rawJson["type"]) as? String
            when(type){
                "ELECTRONIC" -> {
                    val warranty = rawJson["warranty_months"] as? Int ?: 12
                    return Product.Electronic(id, name, warranty)
                }
                "CLOTHING" -> {
                    val size = rawJson["size"] as? String ?: "All Size"
                    return Product.Clothing(id, name, size)
                }
            }
        } catch(e: IllegalArgumentException){
            println(e.message)
        }
        return null
    }
    fun checkout(product: Product){
        val id = when(product){
            is Product.Clothing -> product.id
            is Product.Electronic -> product.id
        }
        val javaResp: String = JavaPaymentService.processPayment(id)!!
        println(javaResp)
    }
}