package inheritance

fun main() {

    val person1 = Person("Pedro", "Oliveira")
    val person2 = Person("Pedro", "Oliveira")

    println(person1)
    println(person2)
    println(person1 == person2)

    //o copy so pode usar se tiver uma data class
    val person3 = person2.copy()
    println(person3)

}

//data class deixa visível Person("Pedro", "Oliveira", 25)
data class Person(
    val firstName: String,
    val lastName: String,
    //agr: Int

) {
    //val age: Int = age Não pode fazer isso por ser uma data class
    val age: Int = 10

}