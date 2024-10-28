package exceptions

import java.awt.event.FocusEvent.Cause

fun main() {
    a()
}

fun a() {
    try {
        b()
    }catch (b: B) {
        throw A(b)
    }
}

fun b() {
    throw B()
}

class A(cause: Throwable) : RuntimeException()
class B : RuntimeException()