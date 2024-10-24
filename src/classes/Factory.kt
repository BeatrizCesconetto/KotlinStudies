package classes

fun main() {

    var car1 = Factory.newCar()
    var car2 = Factory.newCar()
    var car3 = Factory.newCar()

    println("Foram criadas ${Factory.instanceCount} carros")
}

object Factory {

    var instanceCount = 0

    fun newCar(): Car  {
        instanceCount++
        return Car()
    }
}

class Car