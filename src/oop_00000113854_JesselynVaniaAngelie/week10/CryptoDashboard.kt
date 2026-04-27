package oop_00000113854_JesselynVaniaAngelie.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 167.0))
    coinRepo.add(Coin("ETH", 237.0))
    coinRepo.add(Coin("USDT", 180.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    response.data.forEach { println("Name: ${it.name}, Balance: ${it.balance}") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("tx-001", 167.0))
    txRepo.add(Transaction("tx-002", -37.0))
    txRepo.add(Transaction("tx-003", 180.0))
}