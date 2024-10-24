package polimorphism

fun main() {

    val c = Coffee()
    c.prepare()
}

open class Drink{

    open fun prepare(){
        println("Prepare drink")
    }
}

class Coffee : Drink() {

    override fun prepare(){
            super.prepare()
            println("Prepare coffee")
    }
}