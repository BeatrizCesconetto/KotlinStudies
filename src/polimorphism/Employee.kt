package polimorphism

fun main() {

    val a: Programmer = Programmer()
    a.work()

    val b: KotlinProgrammer = KotlinProgrammer()
    b.work()

    //Pode fazer isso pq KotlinProgrammer herda Programmer
    //Nesses casos sempre vai chamar o método
    // do que está instanciado ou na memória
    var c: Programmer = KotlinProgrammer()
    c.work()

    c = Programmer()
    c.work()
}

abstract class Employee {

    //Métodos abstratos somente em classes abstratas
    abstract fun work()

}

open class Programmer : Employee() {
    override fun work() {
       println("Programmer working...")
    }
}

class KotlinProgrammer : Programmer() {

    override fun work() {
        println("Kotlin programmer working")
    }
}

class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }
}