package collectionslambda

/*
* OBJETIVO
* --------
*
* Encontrar um nome de pessoa com o maior número de letras. Depois, encontrar a menor idade dentre as pessoas.
*/

fun main() {

    val maxName = Person
        .data()
        .map { it.name }
        .maxBy { it.length }//maxBy e minBy retorna o elemento que tem a condição

    println(maxName)

    val minAge = Person
        .data()
        .minOf { it.age }//minOf e maxOf retorna o valor associado

    println(minAge)
    }