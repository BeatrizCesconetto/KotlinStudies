package collectionslambda

/*
* OBJETIVO
* --------
*
* Procurar na lista uma pessoa com determinado nome. Retornar a idade dessa pessoa se ela for encontrada, caso
* contrário retornar 0
*/

fun main() {

/*    val age = Person
        .data()
        .find { it.name == "Gustavo" }//Retorna valor null se não encontrar na lista ( firstOrNull faz o mesmo)
        ?.age
        ?:0

    println(age)*/


    val age = Person
        .data()
        .first{ it.name == "Romeu" }//Não retorna valor null se não encontrar na lista
        .age

    println(age)
    }