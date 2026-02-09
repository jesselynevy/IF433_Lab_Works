package oop_00000113854_JesselynVaniaAngelie.week02

class Loan (
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
){
    fun calculateFine() = if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
}