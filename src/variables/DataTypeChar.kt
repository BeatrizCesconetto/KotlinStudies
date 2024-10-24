package variables

fun main() {

    val c: Char = 'A'
    println(c)
    println(c.code)

    val i = 65
    println(i.toChar().inc().inc()) //tem o dec para decrementar

    val c2 = '1'
    println(c2.isDigit())
    println(c2.isUpperCase())
    println(c2.digitToInt())
}