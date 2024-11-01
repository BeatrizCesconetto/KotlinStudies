package enums

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main() {

    println(Operation.PLUS.apply(40,20))
    println(Operation.MINUS.apply(39,21))
}

enum class Operation : BinaryOperator<Int>, IntBinaryOperator{
    PLUS{
        override fun apply(n1: Int, n2: Int): Int = n1 + n2
    },
    MINUS {
        override fun apply(n1: Int, n2: Int): Int = n1 - n2
    };

    abstract override fun apply(n1: Int, n2: Int): Int

    override fun applyAsInt(left: Int, right: Int): Int {
        return apply(left, right)
    }
}