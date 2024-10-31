package collectionslambda

/*
* OBJETIVO
* --------
*
* Obter 3 nos aleatórios
*/

fun main() {

    Person
        .data()
        .map { it.name }
        //.random()//retorna um elemento aleatório
        .shuffled() //Retorna uma lista de elementos aleatórios
        .take(3) //retorna uma lista com os 3 (foi passado como parametro) primeiro elementos
        .forEach { println(it) }

    }