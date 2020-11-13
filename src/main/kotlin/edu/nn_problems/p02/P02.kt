package edu.nn_problems.p02

//  P02 (*) Find the last but one element of a list.
//  Example:
//
//  > penultimate(listOf(1, 1, 2, 3, 5, 8))
//  5


fun <T>penultimate(list: List<T>): T {
    if (list.size < 2) throw NoSuchElementException()

    return list[list.lastIndex - 1];
}
