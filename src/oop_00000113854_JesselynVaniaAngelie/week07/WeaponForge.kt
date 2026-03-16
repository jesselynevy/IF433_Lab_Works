package oop_00000113854_JesselynVaniaAngelie.week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword(): Weapon{
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON),
                durability = 50
            )
        }
        fun forgeEpicSword(): Weapon {
            return Weapon(
                item = GameItem("Pedang Naga Abyssal", 180, ItemRarity.EPIC),
                durability = 300
            )
        }
    }
}