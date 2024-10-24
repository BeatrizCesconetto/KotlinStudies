package classes

/*
*EXERCÍCIO
*---------
*
* Crie a classe CharGenerator, capaz de gerar aleatoriamente um caractere dentro de um intervlo fornecido
* no momento da criação
*/

fun main()  {

    val g = CharGenerator(min ='A',max = 'Z')
    println(g.next())
    println(g.next())
    println(g.next())
}

class CharGenerator(
   val min: Char,
   val max: Char
) {

    fun next() = (min..max).random()

}