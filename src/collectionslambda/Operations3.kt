package collectionslambda

/*
* OBJETIVO
* --------
*
* Construir uma lista com idades distintas das pessoas, ordenada em ordem crescente
*/

fun main() {

    Person
        .data()
        .map { it.age }
        .distinct()
        .sorted()
        .forEach { println(it) }
        //.sortedBy {  } pode botar pelo que quer ordenar
    }