package collectionslambda

/*
* OBJETIVO
* --------
*
* Construir uma lista apenas com o nome das pessoas
*/

fun main() {

    Person
        .data()
        .map { it.name }
        .forEach { println(it) }
    }