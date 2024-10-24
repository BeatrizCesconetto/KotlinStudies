package properties

fun main() {

    val r1 = Rectangle(10, 3)
    println(r1.width)
    println(r1.height)
    println(r1.surface)
}

class Rectangle(
    width: Int, height: Int
) {

    //Se não quiser mudar o comportamento do get/set não precisa chamar ele
    //Não pode ter um val e definir um set mas pode ter val e definir um get
    //Se botar private var width: Int = 0 não vai dar de acessar nem o get, nem o set,
    //mas queremos acessar somente o get e não o set
   var width: Int = width
        private set(value) {
            if (value >= 0)
            field = value
        }
   var height: Int = height
       private set

   val surface
       get() =  width * height

}