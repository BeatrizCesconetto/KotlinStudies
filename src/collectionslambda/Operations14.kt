package collectionslambda

/*
* OBJETIVO
* --------
*
* Criar um mapa a partir da lista de pessoas, mapeando a primeira letra do nome à lista de pessoas cujo nome começa
* com aquela letra
*/

fun main() {

   Person
        .data()
        .groupBy({ it.name[0]}, {it.name} )//quando pega o indice[] de uma String ele pega o character naquela posição
       .forEach { (k, v) -> println("$k -> $v") }
    }