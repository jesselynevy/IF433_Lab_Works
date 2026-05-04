package oop_00000113854_JesselynVaniaAngelie.learning.week89

class AcademicClub(
    clubName: String,
    clubCode: String,
    annualFee: Double,
    val focusSubject: String
): Club(clubName, clubCode, annualFee){
    override fun generateSummary(): String {
        return "[ACADEMIC] $clubCode | $clubName | Subject: $focusSubject | Members: ${getMembers().size}"
    }

    override fun printDetails() {
        println(generateSummary())
        println("Annual Fee: Rp $annualFee")
    }
}