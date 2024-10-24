package selection

fun main() {

    /*
    * EXERCÍCIO
    * ---------
    *
    * Implemente uma calculadora capaz de executar as 4 operações e que recebe os dados via teclado.
    * Três informações devem ser passadas: o primeiro operando, a operação matemática e o segundo operando.
    * Por exemplo:
    * 20
    * +
    * 4
    * Resultado: 24
    */


    print("Digite um número: ")
    var x = readln().toDouble()

    print("Escolha uma das seguintes operações (+ - * /): ")
    var op = readln()[0] //converter em char

    print("Digite outro número: ")
    var y = readln().toDouble()


    val r = when(op) {
        '+' -> x + y
        '-' -> x - y
        '*' -> x * y
        '/' -> x / y
        else -> "Operação inválida"
    }

    print("Resultado: $r")
}