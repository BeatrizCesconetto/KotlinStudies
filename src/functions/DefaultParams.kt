package functions

fun main() {
    sayHello(message = "Tudo bem?")
}

private fun sayHello(name: String = "Desconhecido", message: String ) {
    println("Oi, $name! $message")
}