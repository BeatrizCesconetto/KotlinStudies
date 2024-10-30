package lambda

/*
*EXERCÍCIO
*---------
*
* Implemente uma função que imprime informações na tela entre duas linhas que contém asteriscos (**********). O
* conteúdo impresso deve ser computado através de uma expressão lambda.
*/

fun main() {
    console { "Hey!" }

    println()
    val x = 10

    console {
        val y = (x * 2) * -1
        y + 1
    }
}

fun console(producer: () -> Any) {
    println("**********")
    println(producer())
    println("**********")

}