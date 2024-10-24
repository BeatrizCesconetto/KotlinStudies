package selection

import java.util.Scanner

fun main() {
    /*
    * EXERCÍCIO
    * ---------
    *
    * Escreva um programa que receba um valor numérico pelo teclado, multiplicado por ele mesmo e imprime o resultado.
    * Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes de ser multiplicado.
    */

    val scanner = Scanner(System.`in`)
    print("Digite um número: ")
    var n1 = scanner.nextInt()

    if (n1 > 10) {
        n1 = 10
    }

    n1 *= n1
    println("O resultado é $n1")
}