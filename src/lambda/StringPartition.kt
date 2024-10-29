package lambda

fun main() {

    val (f, s) = "asNJLKJNLbkjbHBHKbkhbGDS".partition { it.isUpperCase() }
    println("First: $f")
    println("Second: $s" )
}