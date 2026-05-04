package oop_00000113854_JesselynVaniaAngelie.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String{
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String{
    return this.repeat(n)
}