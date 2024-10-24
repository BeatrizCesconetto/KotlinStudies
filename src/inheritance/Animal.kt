package inheritance

//só pode ter uma superclasse
//Se não botar o open não vai poder ser herdada
//Com o abstract ele não deixa fazer val animal = Animal("Cinza")
//Abstract foi feita para ser herdada, sem a nescessidade de ter o open
abstract class Animal(
    val color: String
){

    fun eat() {
        println("Eating")
    }

    //quem enxerga é a classe (animal) e as sub-classe (cat e dog)
    protected fun  sleep() {
        println("Sleeping")
    }

}

class Dog(color: String) : Animal(color) {

    fun bark() {
        println("Au-Au")
        sleep()
    }
}

class Cat(color: String) : Animal(color) {

    fun miau(){
        println("Miau")
    }
}