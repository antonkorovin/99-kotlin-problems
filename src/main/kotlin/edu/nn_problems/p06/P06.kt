package edu.nn_problems.p06

//  P06 (*) Find out whether a list is a palindrome.
//  Example:
//
//  > isPalindrome(listOf(1, 2, 3, 2, 1))
//  true

fun <T> isPalindrome(list: List<T>): Boolean {
    return list.isNotEmpty() && list.reversed() == list;
}


fun <T> isPalindromeOptimized(list: List<T>): Boolean {
    if (list.isNotEmpty()) {
        val rList = list.asReversed()
        val elementsToCompare = list.size / 2

        var palindromeFound = true
        var i = 0
        while (i < elementsToCompare && palindromeFound) {

            palindromeFound = list[i] == rList[i]
            ++i
        }

        return palindromeFound
    }

    return false
}


fun <T> isPalindromeRecursive(list: List<T>): Boolean {
    val rList = list.asReversed()
    val elementsToCompare = list.size / 2

    tailrec fun isPalindromeOptimizedTailRecursive(i: Int = 0, palindrome: Boolean = true): Boolean {
        return if (palindrome && i < elementsToCompare) {
            isPalindromeOptimizedTailRecursive(
                    i + 1,
                    list[i] == rList[i]
            )
        } else {
            palindrome
        }
    }

    return list.isNotEmpty() && isPalindromeOptimizedTailRecursive()
}
