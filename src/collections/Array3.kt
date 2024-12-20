package collections

import kotlin.math.PI

fun main() {

    val circles = arrayOf(
        Circle(1.0),
        Circle(3.0),
        Circle(6.0)
    )

    repeat(circles.size) {
        val circle = circles[it]
        val surface = circle.surface()
        println(surface)
    }

    for (i in circles.indices){
        val circle = circles[i]
        val surface = circle.surface()
        println(surface)
    }

    //O que é normalmente usado
    circles.forEach { println(it.surface()) }
}

class Circle (val radius: Double) {
    fun surface() =  PI * radius * radius

}