package edu.nn_problems.p01

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

typealias LastFunc<T> = (List<T>) -> T

class P01Test : FunSpec({
    fun checkFun(f: LastFunc<Int>) {
        f(listOf(1, 1, 2, 3, 5, 8)) shouldBe 8
        f(listOf(42)) shouldBe 42

        shouldThrow<NoSuchElementException> {
            f(emptyList())
        }
    }

    test("built-in last") {
        checkFun(::builtInLast)
    }

    test("last by index") {
        checkFun(::lastByIndex)
    }
})
