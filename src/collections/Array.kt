package collections

fun main() {

    //val array = Array (5) {"*"}
    val array = arrayOf("*", "*", "*", "*")

    array[0] = "A"
    array[3] = "D"
    //array[5] = "F"

    println(array.contentToString())
    }