package collectionslambda

/*
* OBJETIVO
* --------
*
* Criar uma String com os nomes das pessoas separados por um hífen
*/

fun main() {

    val names = Person
        .data()
        .joinToString(separator = "-") { it.name }

    println(names)
    }