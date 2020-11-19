package edu.nn_problems.p06

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class P06Test : FunSpec({

    test("isPalindrome") {
        isPalindrome(listOf(1, 2, 3, 2, 1)) shouldBe true
        isPalindrome(listOf(1, 2, 3, 2, 42)) shouldBe false
        isPalindrome(listOf(42, 2, 3, 2, 1)) shouldBe false
    }

})
