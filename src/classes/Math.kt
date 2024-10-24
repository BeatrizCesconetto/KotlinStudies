package classes

import variables.x

fun main() {

    println(Math.sum(20,10))
    println(Math().subtract(20, 10))
}

class Math{

    fun subtract(a: Int,b: Int) = a - b

    companion object{

        fun sum(a: Int,b: Int) = a + b
    }
}