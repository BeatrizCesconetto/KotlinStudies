package collectionslambda

/*
* OBJETIVO
* --------
*
* Procurar na lista uma pessoa com uam determinada idade. Retornar um boolean indicando se ela foi encontrada.
*/

fun main() {

    val existAge = Person
        .data()
        //.any{ it.age == 19 }
        //.all { it.age == 19 } //Só retorna true se todos os elementos tiverem age = 19
        .none { it.age == 19 } //Retorna true se nenhum elemento tiver age = 19

    println(existAge)
    }