package collections

fun main() {

    /*val map1 = mapOf(
        Pair(1, "A"),
        Pair(2, "B")
    )*/

    //1 e 2 são as chaves
    val map1 = mapOf(1 to "A", 2 to "B")
    println(map1)

    val v1 = map1[2]//Se a chave for uma String pode botar também
    println(v1)

    val map2 = map1.toMutableMap()
    //map2.put(3, "C") Não é comum usar o put
    map2[3] = "C"
}