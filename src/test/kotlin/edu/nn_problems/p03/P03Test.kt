package edu.nn_problems.p03

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class P03Test : FunSpec({

    test("nth") {
        val x = listOf(1, 1, 2, 3, 5, 8)

        nth(2, x) shouldBe 2

        shouldThrow<NoSuchElementException> {
            nth(-1, x)
        }

        shouldThrow<NoSuchElementException> {
            nth(x.size, x)
        }

        shouldThrow<NoSuchElementException> {
            nth(0, emptyList())
        }
    }

})
