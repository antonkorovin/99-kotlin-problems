package edu.nn_problems.p03

//  P03 (*) Find the Nth element of a list.
//  By convention, the first element in the list is element 0. Example:
//
//  > nth(2, listOf(1, 1, 2, 3, 5, 8))
//  2

fun<T> nth(n: Int, list: List<T>): T {
    if (n < 0 || n >= list.size) throw NoSuchElementException()

    return list[n]
}
