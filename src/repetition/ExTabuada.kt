package repetition

/*
*EXERCÍCIO
* --------
*
* Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
*/

fun main() {

    print("Digite um número para ver a tabuada dele: ")
    val num =  readln().toInt()

    var x = 1
    //var res = 0

    while (x <= 10) {
        //res = num * x
        println("$num X $x = ${num * x++}")
        //x++
    }
}