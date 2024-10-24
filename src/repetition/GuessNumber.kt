package repetition

import kotlin.random.Random

/*
*EXERCÍCIO
* --------
*
* Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um intervalo e você
* deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor do que o número tentado.
* O jogo acaba quando o número tentado for o número correto
*/
fun main() {

    val random = Random.nextInt(0,101)
    //var playing = true
    //var x = 0

    while (true /*playing*/ ) {
        print("> ")
        val x = readln().toInt()

        when {
            x > random -> println("O número que você escolheu é maior que o sorteado")
            x < random -> println("O número que você escolheu é menor que o sorteado")
            else -> {
                println("Você acertou, o número era $x")
                break
                //playing = false
            }
        }
    }

    //println("Você acertou, o número era $x")
}