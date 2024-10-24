package selection

fun main(){

    /*
    *Exercício
    * --------
    *
    * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar
    */

    print("Digite um número: ")
    var x = readln().toInt()

    val type: String
    if (x % 2 == 0){
        type = "Par"
    }else {
        type = "Ìmpar"
    }

    println(type)
}