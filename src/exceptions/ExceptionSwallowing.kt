package exceptions

fun main() {
    // NÃO É BOM ENGOLIR EXCEÇÕES

    val bankAccount = BankAccount()
    try {

        bankAccount.depoist(300.0)
        bankAccount.withdraw(500.0)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    //Na pior das hipóteses botar pelo menos um  e.printStackTrace()
    println(bankAccount.balance)
}