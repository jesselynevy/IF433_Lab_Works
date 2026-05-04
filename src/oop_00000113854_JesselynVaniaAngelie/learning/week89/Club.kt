package oop_00000113854_JesselynVaniaAngelie.learning.week89

abstract class Club(
    val clubName: String,
    clubCode: String,
    annualFee: Double
): IClubReport{
    private val memberList: MutableList<Member> = mutableListOf()

    var clubCode: String = ""
        set(value){
            field = value.uppercase()
        }
        get() {
            return "CLB-$field"
        }

    var annualFee: Double = 0.0
        set(value){
            if(value >= 0){
                field = value
            } else{
                println("[Error] Fee cannot be negative!")
            }
        }

    init {
        this.clubCode = clubCode
        this.annualFee = annualFee
    }

    fun enrollMember(member: Member){
        memberList.add(member)
    }

    fun getMembers(): List<Member>{
        return memberList
    }

    abstract override fun generateSummary(): String
    abstract override fun printDetails()
}