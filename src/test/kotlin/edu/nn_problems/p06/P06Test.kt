package edu.nn_problems.p06

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

typealias Func<T> = (List<T>) -> Boolean

class P06Test : FunSpec({

    fun checkFun(f: Func<Int>) {
        f(listOf(1, 2, 3, 2, 1)) shouldBe true
        f(listOf(1, 2, 2, 1)) shouldBe true
        f(listOf(1, 2, 3, 2, 42)) shouldBe false
        f(listOf(42, 2, 3, 2, 1)) shouldBe false
        f(listOf(42)) shouldBe true
        f(listOf()) shouldBe false
    }

    test("isPalindrome") {
        checkFun(::isPalindrome)
    }

    test("isPalindromeOptimized") {
        checkFun(::isPalindromeOptimized)
    }
})
