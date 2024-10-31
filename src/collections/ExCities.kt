package collections

/*
*EXERCÍCIO
*---------
*
* Crie uma lista de cidades que você visitou hipoteticamente nos últimos meses (a lista pode conter cidades repetidas).
* Crie um algoritmo que conta quantas cidades diferentes você visitou (isto é, excluindo cidades duplicadas)
*/

fun main() {

    val cities = listOf("Londres", "Paris", "Lisboa", "Londres", "Roma", "Roma", "Berlim", "Madrid", "Lisboa")
    println(cities)

    val uniqueCities = cities.toSet()
    println(uniqueCities)

    println(uniqueCities.size)
}