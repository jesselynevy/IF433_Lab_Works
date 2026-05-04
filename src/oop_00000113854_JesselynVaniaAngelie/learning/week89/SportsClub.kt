package oop_00000113854_JesselynVaniaAngelie.learning.week89

class SportsClub (
    clubName: String,
    clubCode: String,
    annualFee: Double,
    val sportType: String
) : Club(clubName, clubCode, annualFee) {
    override fun generateSummary(): String {
        return "[SPORTS] $clubCode | $clubName | Sport: $sportType | Members: ${getMembers().size}"
    }

    override fun printDetails() {
        println(generateSummary())
        println("Annual Fee: Rp $annualFee")
    }
}