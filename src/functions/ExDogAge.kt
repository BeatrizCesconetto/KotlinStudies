package functions

/*
*EXERCÍCIO
* --------
*
* Escreva uma função que calcula a idade humana de um cachorro, considerando que cada ano que
* um cachorro vive corresponde  a 7 anos de vida de um ser humano. O valor da idade deve ser fornecido via teclado.
*/

fun main() {
    //dogAge()
    println(
        calculateDogAge(
            readln().toDouble()
        ).toInt()
    )
}

/*private fun dogAge() {
    print("Qual a idade do seu cachorro: ")
    var dogAge = readln().toInt()
    println("O cachorro tem ${dogAge * 7} anos de idade humana")
}*/

private fun calculateDogAge(age: Double): Double{
    return age * 7
}