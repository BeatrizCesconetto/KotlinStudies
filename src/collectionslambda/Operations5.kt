package collectionslambda

/*
* OBJETIVO
* --------
*
* Obter a quantidade de pessoas cujo nome começa com a letra 'R'
*/

fun main() {

   /*val coount = Person
        .data()
        .filter { it.name.uppercase().startsWith("R") }
        .count()

    println(coount)   */

    val count = Person
        .data()
        .count {it.name.uppercase().startsWith("R")}
}