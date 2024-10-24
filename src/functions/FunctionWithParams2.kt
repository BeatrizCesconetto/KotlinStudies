package functions

fun main() {

    sayHello("Beatriz", 20)
    sayHello("Maria", 15)
    sayHello("Ana", 10)

    
}

private fun sayHello(name: String, temperature: Int){
    println("Olá, $name! Temperatura é $temperature graus")
}

