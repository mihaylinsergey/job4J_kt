package ru.job4j.lambda

fun count(list: List<Int>) : Long {
    return list
        .stream()
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .count()
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println(count(list))
}