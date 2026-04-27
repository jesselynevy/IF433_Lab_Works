package oop_00000113854_JesselynVaniaAngelie.testing

class NotificationService{
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        if (user.email != null){
            sendEmail(user.email)
        }else{
            println("User ${user.name} tidak memiliki email")
        }
    }
}