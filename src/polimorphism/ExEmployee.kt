package polimorphism

/*
* EXERCÍCIO
*----------
*
* Crie uma classe Worker para representar um trabalhador que possui um salário base. Um worker tem um método pay(),
* que retorna o valor total a ser pago pelo seu salário.
*
* Para calcular o valor total do salário é preciso multiplicar o salário base por um multiplicador, o qual depende
* do tipo de trabalhador: se for um trabalhador que ganha por hora, o multiplicador é o número de horas trabalhadas;
* se for um trabalhador freelancer, o salário já é acordado de antemão
*/

var totalPay = 0.0

fun main() {

    val w1: Worker = HourlyWorker(100.0, 160)
    val w2: Worker = Freelancer(5000.0)
    pay(w1)
    pay(w2)
    println(totalPay)
}

fun pay(worker: Worker) {
    totalPay += worker.pay()
}

//Se não for usar a propriedade da classe dentro dela não precisa botar val/var
abstract class Worker(val baseSalary: Double){

    fun pay() : Double {
        return baseSalary * multiplier()
    }

    //o abstract no método força ele a ser implementado nas subclasses herdadas
    abstract fun multiplier() : Double
}

class HourlyWorker(
    val hourPrice: Double,
    val hoursWorked: Int
) : Worker(hourPrice) {

    override fun multiplier(): Double {
        return hoursWorked.toDouble()
    }

}

class Freelancer(
    val totalSalary: Double
) : Worker(totalSalary) {

    override fun multiplier(): Double {
        return 1.0
    }
}