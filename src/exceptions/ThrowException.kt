package exceptions
//Superclasse = classe pai
fun main(){

    val account = BankAccount()

    try {
        account.deposit(500.0)
        account.withdraw(200.0)
        //Fazer catch apenas de exception e não de error
    } catch (e: Exception) {
        println("Error! ${e.message}")
        //Mesmo quando da erro o finally é executado
    } finally {
        println("Balance: ${account.balance}")
    }
}

class BankAccount() {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        balance += value
    }

    fun withdraw(value: Double) {

        if (value < 0) {
        throw InvalidValueException(value)
        }

        if (balance - value  < 0) {
            throw InsufficientFundException(balance)
            }

        balance -= value
    }
}
