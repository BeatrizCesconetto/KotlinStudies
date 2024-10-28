package classes

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



fun main() {

    val w1 = HourlyWorker(240.0, 10)
    val w2 = Freelancer(1400.0)

    w1.pay()
    w2.pay()
    println(w1.pay())
    println(w2.pay())
}

abstract class Worker(private val salarioBase: Double) {

    fun pay() : Double {
       return salarioBase * hoursWorked()
    }
    //o abstract no método força ele a ser implementado nas subclasses herdadas
    open fun hoursWorked() : Double {
        return 1.0
    }
}
//Se não for usar a propriedade da classe dentro dela não precisa botar val/var
class HourlyWorker(valorHora: Double, private val horasTrabalhadas: Int) : Worker(valorHora) {
    override fun hoursWorked(): Double {
        return horasTrabalhadas.toDouble()
    }
}

class Freelancer(salario: Double) : Worker(salario)

