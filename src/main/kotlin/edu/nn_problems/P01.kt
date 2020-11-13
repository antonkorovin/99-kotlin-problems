package edu.nn_problems

//  P01 (*) Find the last element of a list.
//  Example:
//
//  > last(listOf(1, 1, 2, 3, 5, 8))
//  8
fun<T> builtInLast(list: List<T>): T {
    return list.last()
}

fun<T> lastByIndex(list: List<T>): T {
    if (list.isEmpty()) throw NoSuchElementException()

    return list[list.lastIndex]
}
