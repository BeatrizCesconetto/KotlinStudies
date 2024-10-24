package selection

fun main() {

    /*
    *EXERCÍCIO
    * --------
    *
    * Escreva um programa que, com base na idade fornecida, classifica a pessoa nos grupos ab abaixo:
    *
    * - CRIANÇA: 0 A 12 anos
    * - ADOLESCENTE: 13 A 17 anos
    * - ADULTO: 18 A 65 anos
    * - SÊNIOR: 65 anos ou mais
    */

    print("Qual a sua idade? ")
    val age = readln().toInt()

    if (age in 0..12) {
        println("Criança")
    }else if (age in 13..17) {
        println("Adolescente")
    }else if (age in 18..65){
        println("Adulto")
    }else if (age in 66..120){
        println("Sênior")
    }else {
        println("Idade inválida")
    }

}