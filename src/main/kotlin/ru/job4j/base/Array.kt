package ru.job4j.base

fun defragment(array : Array<String?>) {
    var current = 0;
    for (i in array.indices) {
        if (array[i] != null) {
            array[current] = array[i]
            current++
        }
    }
    while (current < array.size) {
        array[current] = null
        current++
    }
}