package ru.job4j.lambda

import kotlin.math.pow

fun main() {
    val decrement = { x : Int -> x - 1}
    println(decrement(10))
    val exp = { x : Double, y : Double -> x.pow(y) }
    println(exp(2.0, 3.0))
}