package polimorphism

fun main() {
    val tree = Tree("Brown", 1.57)
    val treeCopy = tree.clone()

    println(tree)
    println(treeCopy)
}

//Não da para definir propriedades na interface
//Se botar uma propriedade ela vai ser abstrata precisando de um override
//Não tem construtor em interface
//Interface pode herdar de várias interfaces
interface Cloneable {

    //Por padrão métodos não implementados de interface já são abstratos
    fun clone() : Any
}

data class Tree(
    val color: String,
    val height: Double
) : Cloneable {

    override fun clone() : Any {
        return Tree(color, height)
    }
}