package oop_00000113854_JesselynVaniaAngelie.learning.week89

class ClassAssociation {
    private val clubRegistry: MutableMap<String, Club> = mutableMapOf()
    private val allMembers: MutableList<Member> = mutableListOf()

    fun registerClub(club: Club) {
        val rawCode = club.clubCode.removePrefix("CLB-")
        clubRegistry[rawCode] = club
    }

    fun findClub(code: String): Club?{
        return clubRegistry[code.uppercase()]
    }

    fun enrollToClub(clubCode: String, member: Member){

    }
}