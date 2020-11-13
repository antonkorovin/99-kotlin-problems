package edu.nn_problems

//  P01 (*) Find the last element of a list.
//  Example:
//
//  > last(listOf(1, 1, 2, 3, 5, 8))
//  8
fun builtInLast(list: List<Int>): Int {
    return list.last()
}

fun lastByIndex(list: List<Int>): Int {
    if (list.isEmpty()) throw NoSuchElementException()

    return list[list.lastIndex]
}
