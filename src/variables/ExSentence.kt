package variables

import java.util.Scanner

/*
* EXERCÍCIO
* ---------
*
* Solicite 3 informoações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas
* informações (use string templates para montar a frase)
*/

fun main() {

    val scanner = Scanner(System.`in`)
    print("Digite o seu nome: ")
    val name = scanner.next()

    print("Digite a sua idade: ")
    val age = scanner.nextInt()

    print("Digite o seu peso: ")
    val weight = scanner.nextDouble()

    println("O seu nome é $name. Você tem $age anos e seu peso é $weight. ")
}
