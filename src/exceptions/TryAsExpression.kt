package exceptions

fun main() {

    print("> ")
    val v = readln()
    val i = try {
        v.toInt()
    } catch (e: NumberFormatException) {
        0
    } //Se der erro (como botar uma String) ele vai fazer o v = 0

    println("I = $i")
}