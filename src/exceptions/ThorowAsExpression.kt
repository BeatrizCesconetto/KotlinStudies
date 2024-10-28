package exceptions

fun main() {

    //val x = throw IllegalArgumentException()

    val i : Int? = 10

    //Não pode mais ser nulo por causa do throw. O valor nulo não chega no print.

    val d = i?.toDouble() ?: throw IllegalArgumentException()

    println(d)
}