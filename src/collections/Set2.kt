package collections

import java.util.Objects

fun main() {

    val dogs = setOf(
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
        Dog("D4")
    )

    println(dogs)
}

//botando um data class ele não deixa repetir o D2
data class Dog(val name: String) {
    override fun toString() = "Name = $name, hashCode = ${hashCode()}"

    /*Implementar esse método para não repetir nada, caso o data class n possa ser usado
    override fun hashCode(): Int {
        return Objects.hash(name)
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Dog) {
            this.name == other.name
        } else {
            false
        }
    }*/
}