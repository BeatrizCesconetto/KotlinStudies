package collectionslambda

/*
* OBJETIVO
* --------
*
* Somar a idade de todas as pessoas
*/

fun main() {

    val sum = Person
        .data()
        .map { it.age }
        //.sumOf { it.age }
        .reduce {acc, age -> acc + age }//acc = acumulador

    println(sum)
    }