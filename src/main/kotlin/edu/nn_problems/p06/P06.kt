package edu.nn_problems.p06

//  P06 (*) Find out whether a list is a palindrome.
//  Example:
//
//  > isPalindrome(listOf(1, 2, 3, 2, 1))
//  true

fun <T>isPalindrome(list: List<T>): Boolean {
    return list.reversed() == list;
}