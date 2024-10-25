package polimorphism

fun main() {

    //val account = Account(PersonName("Carlos", "Tosin"))

    val account = Account(object : Nameable {
        override val firstName: String = "Carlos"
        override val lastName: String = "Tosin"
    })
    account.deposit(1000.0)
    account.print()

}

class Account(private val owner: Nameable) : Printable {
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }
}

interface Nameable {
    //Quem implementar precisa dar um valor a firstName e lastName
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
}

interface Printable {
    fun print()
}

class PersonName(override val firstName: String, override val lastName: String) : Nameable