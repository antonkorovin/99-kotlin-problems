package edu.nn_problems

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class P01Test : FunSpec({


    test("built-in last") {
        last(listOf(1, 1, 2, 3, 5, 8)) shouldBe 8
    }

})
