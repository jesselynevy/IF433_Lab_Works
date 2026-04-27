package oop_00000113854_JesselynVaniaAngelie.testing

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
){
    companion object{
        fun forgeStarterSword():Weapon{
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON),
                durability = 50
            )
        }
        fun forgeEpicSword():Weapon{
            return Weapon(
                item = GameItem("Pedang Emas", 50, ItemRarity.EPIC),
                durability = 200
            )
        }
    }
}