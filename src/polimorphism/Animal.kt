package polimorphism

fun main() {

    val a: Dog = Dog()
    a.run()
    a.eat()

    val b: Animal = Dog()
    //Não pode chamar b.run() porque é uma variável do tipo Animal

    if (b is Dog) {
        b.run()
        b.eat()
    }

    //val c: Dog = b as Dog
    //as para mudar a variável do tipo Animal para Dog, rodando o b.run()


}

abstract class Animal {

   fun eat() {
       println("Eating")
   }
}

class Dog: Animal() {

    fun run(){
        println("Running")
    }
}

class Cat : Animal() {

    fun sleep() {
        println("Sleeping...")
    }
}