package enums

import enums.Month.*

fun main() {

    val month = MAY
    println(month.numberOfMonth)
    println(month.name)
    println(month.ordinal)

    var nextMonth = month
        .next()
    println(nextMonth)

    val month11 = Month.getEnumByNumeberOfMonth(12)
    println(month11)

    val mothAugust = Month.valueOf("AUGUST")
    println(mothAugust)
    println(mothAugust.getTotalDays())
  }

enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12); // ; => Para saber que terminou

    fun next() :Month {
       return Month
            .values()
            .find { it.numberOfMonth == numberOfMonth + 1}
            ?: JANUARY
    }

    fun getTotalDays(): Int {
        return when (this) {
            JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31
            FEBRUARY -> 28
            else -> 30
        }
    }

    companion object {
        fun getEnumByNumeberOfMonth(numberOfMonth: Int) : Month {
            return Month
                .values()
                .first {  it.numberOfMonth == numberOfMonth}
        }
    }
}