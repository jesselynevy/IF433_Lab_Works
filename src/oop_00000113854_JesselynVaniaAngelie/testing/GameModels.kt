package oop_00000113854_JesselynVaniaAngelie.testing

enum class ItemRarity(val dropChance: Int){
    COMMON(70),
    UNCOMMON(60),
    RARE(50),
    EPIC(30),
    LEGENDARY(20),
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)