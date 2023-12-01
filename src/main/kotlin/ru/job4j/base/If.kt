package ru.job4j.base

fun max(first: Int, second: Int) = if (first > second) first else second

fun max(a : Int, b : Int, c : Int) : Int {
    return if (a >= b && a >= c) a else if (b >= a && b >= c) b else c
}