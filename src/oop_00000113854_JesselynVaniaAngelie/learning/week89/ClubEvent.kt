package oop_00000113854_JesselynVaniaAngelie.learning.week89

sealed class ClubEvent{
    data class Workshop(val facilitator: String, val durationHours: Int): ClubEvent()
    data class Competition(val organizer: String, val prizeMoney: Double): ClubEvent()
}