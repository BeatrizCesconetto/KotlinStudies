package exceptions

/**
 *EXERCÍCIO
 *---------
 *
 * Crie uma classe Rect para representar um retângulo. O retângulo deve receber dois valores de lado quando for criado,
 *e os lados não podem ser 0 ou com valor negativo. Nestes casos, uma IllegalArgumentException deve ser lançado.
 **/

fun main() {

    val rect = Rect(10.0, 2.0)
    println(rect)
}

data class Rect(val l1: Double, val l2: Double)  {
    init {
        require(l1 > 0)
        require(l2 > 0)
    }
}