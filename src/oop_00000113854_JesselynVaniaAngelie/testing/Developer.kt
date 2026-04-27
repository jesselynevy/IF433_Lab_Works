package oop_00000113854_JesselynVaniaAngelie.testing

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding dengan $programmingLanguage")
    }
}