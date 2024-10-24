package variables

fun main() {
    /*
    * O rato roeu
    * a $roupa do
    * rei de "Roma"
     */

    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."

    val s2 = """
        O rato roeu
         a roupa do
          rei de "Roma"
    """.trimIndent() //do jeito que colocar ela vai ficar

    println(s1)
    println()
    println(s2)

}