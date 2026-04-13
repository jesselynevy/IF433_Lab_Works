package oop_00000113854_JesselynVaniaAngelie.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>) : Product?{
        try{
            val id = requireNotNull(rawJson["id"]){
                "API Invalid: Missing ID"
            } as String
            val name = requireNotNull(rawJson["name"]){
                "API Invalid: Missing name"
            } as String
            val type = requireNotNull(rawJson["type"]) as? String
            if(type == "ELECTRONIC"){
                val warranty = requireNotNull(rawJson["warranty"]) as? Int ?: 12
                return Product.Electronic(id, name, warranty)
            } else if(type == "CLOTHING"){
                val size = requireNotNull(rawJson["size"]) as? String ?: "All Size"
                return Product.Clothing(id, name, size)
            }
        } catch(e: IllegalArgumentException){
            println(e.message)
        }
        return null
    }
}