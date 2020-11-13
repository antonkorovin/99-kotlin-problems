package edu.nn_problems.p02

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

typealias Func<T> = (List<T>) -> T

class P02Test : FunSpec({

    fun checkFun(f: Func<Int>) {
        f(listOf(1, 1, 2, 3, 5, 8)) shouldBe 5

        shouldThrow<NoSuchElementException> {
            f(listOf(42))
        }

        shouldThrow<NoSuchElementException> {
            f(emptyList())
        }
    }

    test("penultimate") {
        checkFun(::penultimate)
    }

    test("penultimateReversed") {
        checkFun(::penultimateReversed)
    }

})
