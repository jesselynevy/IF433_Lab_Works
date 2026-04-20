package oop_00000113854_JesselynVaniaAngelie.week09

fun main(){
    println("=== TEST LAMBDA ===")
    // Syntax Lambda eksplisit: { parameter -> body }
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Lmabda dengan satu parameter bisa menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = {it * it}
    println("Hasil Square: ${squareImplicit(4)}")

}