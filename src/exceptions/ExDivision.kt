package exceptions

/**
 *EXERCÍCIO
 *---------
 *
 *Escreva uma função que divide dois números. Se for uma divisão por 0, a função deve retornar 0 como resultado.
 *Os parâmetros e o retorno do método devem ser todos do tipo Int.
 **/

fun main() {
    println(div(10,5))

}

fun  div(n1: Int, n2: Int): Int {
    return try {
         n1 / n2
        //Quando n for usar uma variavel usar _
    } catch (_: ArithmeticException) {
        0
    }
}