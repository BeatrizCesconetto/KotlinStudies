package lambda

fun main() {

    //Quando tem it ele pega o valor passado (Int) e multiplica por 2
    val f: (Int) -> Int = { it * 2 }
    println(f(12))

}