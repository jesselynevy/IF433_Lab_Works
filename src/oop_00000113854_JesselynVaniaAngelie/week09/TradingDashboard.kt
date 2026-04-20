package oop_00000113854_JesselynVaniaAngelie.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog(
            pair = "BTCUSDT",
            position = "LONG",
            leverage = 10,
            roe = 45.32,
            status = "CLOSED"
        ),
        TradeLog(
            pair = "ETHUSDT",
            position = "SHORT",
            leverage = 5,
            roe = -18.75,
            status = "CLOSED"
        ),
        TradeLog(
            pair = "BTCUSDT",
            position = "SHORT",
            leverage = 20,
            roe = -32.10,
            status = "CLOSED"
        ),
        TradeLog(
            pair = "ETHUSDT",
            position = "LONG",
            leverage = 3,
            roe = 27.88,
            status = "OPEN"
        ),
        TradeLog(
            pair = "SOLUSDT",
            position = "LONG",
            leverage = 15,
            roe = 12.50,
            status = "OPEN"
        ),
        TradeLog(
            pair = "SOLUSDT",
            position = "SHORT",
            leverage = 8,
            roe = -9.40,
            status = "CLOSED"
        )
    )

    val closedTrades = tradeHistory.filter{it.status == "CLOSED"}
    val winningTrades = closedTrades.filter{it.roe > 0}
    val losingTrades = closedTrades.filter{it.roe <= 0}
}