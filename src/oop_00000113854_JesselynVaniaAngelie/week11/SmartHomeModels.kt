package oop_00000113854_JesselynVaniaAngelie.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String{
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: ${if(isOnline) 
        "Online" else "Offline"} | Daya: $powerLoad Watt"
}