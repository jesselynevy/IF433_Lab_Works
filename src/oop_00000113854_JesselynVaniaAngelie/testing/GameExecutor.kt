package oop_00000113854_JesselynVaniaAngelie.testing

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
        println("⚔️ Monster Muncul: ${event.monsterName}! Bersiaplah untuk bertarung!")
    }
        is BattleState.LootDropped -> {
            println("🎁 Loot Didapat: ${event.item.name} | Damage: ${event.item.damage} | Rarity: ${event.item.rarity}")
        }
        is BattleState.GameOver -> {
            val (reason) = event
            println("💀 Game Over! $reason")
        }
        BattleState.SafeZone -> {
            println("✅ Kamu berada di Safe Zone. Tidak ada ancaman.")
        }
    }
}