package functions

/*
*EXERCÍCIO
*---------
*
* Escreva uma função que separa todos os caracteres de uma string com um espaço em branco. Esta função também deve
* receber um parâmetro opcional indicando se a string deve ser convertida para maiúscula.
*/

fun main() {
    println(spacing("Oi, tudo bem ?"))
}

private fun spacing (str: String, isUpperCase: Boolean = false): String {
    val sb = StringBuilder()

    for (c in str) {
       sb.append("$c ")
    }

    val  r = sb.toString()

    return if (isUpperCase) {
       r.uppercase()
    }else{
        r
    }

}