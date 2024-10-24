package properties

fun main() {

    val  s1 = Square(10)
    val  s2 = Square(10)
    val  s3 = Square(-10)
}

class Square(
    val size: Int
) {
    init {
        println("Init1")
        require(size > 0)//obrigatório ser maior que 0
    }

    init {
        println("Init2")
    }

}