package organization

import organization.p1.Counter
import organization.p2.Counter as CountDecremente

fun main() {

    val c1 = Counter()
    c1.increment()

    val c2 = CountDecremente()
    c2.decrement()
}