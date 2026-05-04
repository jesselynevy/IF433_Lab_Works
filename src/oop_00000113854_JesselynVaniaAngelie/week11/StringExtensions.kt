package oop_00000113854_JesselynVaniaAngelie.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String{
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String{
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean{
    // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
    // this == null The object reference itself doesn't exist
    // this.isEmpty() The object exists but has no content (e.g. "", [], {})
}