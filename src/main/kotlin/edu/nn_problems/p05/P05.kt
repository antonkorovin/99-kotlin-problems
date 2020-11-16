package edu.nn_problems.p05

//  P05 (*) Reverse a list.
//  Example:
//
//  > reverse(listOf(1, 1, 2, 3, 5, 8))
//  [8, 5, 3, 2, 1, 1]

fun <T>builtInReverse(list: List<T>): List<T> {
    return list.reversed()
}
