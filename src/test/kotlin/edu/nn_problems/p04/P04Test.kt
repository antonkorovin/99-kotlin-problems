package edu.nn_problems.p04

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class P04Test : FunSpec({

    test("length") {
        length(listOf(1, 1, 2, 3, 5, 8)) shouldBe 6
        length(emptyList<Int>()) shouldBe 0
    }

})
