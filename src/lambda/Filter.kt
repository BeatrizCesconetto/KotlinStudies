package lambda

fun main() {

    val s1 = "ijfdsojflsdkjfosijfjl93284029jnh3jnkj42n4kn"

    val s2 = s1.filter { it.isDigit() }
    val s3 = s1.filter { it.isLetter() }

    println(s2)
    println(s3)

    val s4 = s1.filterIndexed { i, c ->
        val digit = c.isDigit()
        if (digit) {
            println("Found digit '$c' in position '$i'")
        }
        digit
    }

    println(s4)
}