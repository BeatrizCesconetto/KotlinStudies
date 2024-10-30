package lambda

fun main(){

    // Não usa return em expressão lambda
    val f: (Int) -> Int = {n: Int ->
        val d = n * 2
        println("New value: $d")
        d //Retorno da expressão lambda
    }

f(20)
}
