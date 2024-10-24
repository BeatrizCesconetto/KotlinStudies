package classes

fun main(){
    Math2.sum(10,20)
    Math2.subtract(20, 10)
    Math2.pi
}

//Na object pode ter métodos e propriedades
object Math2{

    val pi = 3.1416

    fun subtract(a: Int,b: Int) = a - b

    fun sum(a: Int,b: Int) = a + b

}