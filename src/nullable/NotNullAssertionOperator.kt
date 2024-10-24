package nullable

fun main() {
    //evitar ao máximo

    val s: String? = null
    val  i = s!!.reversed()


    println(i)
}