package collections

/*
* EXERCÍCIO
* ---------
*
* Crie um mapa que mapeia códigos telefônicos ao seus países associados. A partir desse mapa, gere uma lista mutável
* que contém os países associados a estes códigos ordenados em ordem alfabética decrescente
*/

fun main() {

    println(
        mapOf(
            55 to "Brazil",
            351 to "Portugal",
            54 to "Argentina",
            1 to "United States"
        ).values.toMutableList().toSortedSet(Comparator.reverseOrder())
    )

    /*val codesMap = mapOf(
        55 to "Brazil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    )

    println(codesMap)

    val countries = codesMap.values.toMutableList().toSortedSet(Comparator.reverseOrder())
    println(countries)
*/
}