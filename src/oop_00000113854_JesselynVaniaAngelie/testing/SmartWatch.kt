package oop_00000113854_JesselynVaniaAngelie.testing

class SmartWatch: Watch(), BluetoothConnectable, Rechargeable{
    override fun showTime() {
        println("Layar OLED nyala 03.01 WIB")
    }
    override fun connectToBluetooth() {
        println("Cari perangkat HP")
    }
    override fun chargeBattery() {
        println("Mengisi daya dengan 17W")
    }
}