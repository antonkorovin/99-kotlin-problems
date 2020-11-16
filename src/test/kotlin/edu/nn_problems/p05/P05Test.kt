package edu.nn_problems.p05

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class P05Test : FunSpec({

    test("builtInReverse") {
        builtInReverse(listOf(1, 1, 2, 3, 5, 8)) shouldBe listOf(8, 5, 3, 2, 1, 1)
    }

})
