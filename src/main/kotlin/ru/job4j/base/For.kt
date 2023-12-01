package ru.job4j.base

fun draw(size : Int) {
    if (size > 0 && size % 2 != 0) {
        for (row in 0 until  size) {
            for (cell in 0 until size) {
                var left = row == cell
                var right = cell == size - 1 - row
                if (left) {
                    print("x")
                } else if (right) {
                    print("x")
                } else {
                    print(" ")
                }
            }
            println()
        }
        println()
    } else {
        println("The size must be greater than zero and an odd number")
    }
}

fun main() {
    draw(7)
}