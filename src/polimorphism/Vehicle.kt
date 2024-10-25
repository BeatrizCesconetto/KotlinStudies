package polimorphism

fun main() {

    //Usar esse meétodo se for usar uma vez só caso contrario não vale a pena
    val vehicle = object : Vehicle{
        override fun drive() {
            println("Driving...")
        }
    }

    vehicle.drive()
}

interface Vehicle {
    fun drive()
}