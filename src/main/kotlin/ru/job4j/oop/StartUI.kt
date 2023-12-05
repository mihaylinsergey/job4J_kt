package ru.job4j.oop

import java.util.Scanner

object StartUI {
    fun init(scanner: Scanner, tracker: Tracker) {
        var run = true
        while (run) {
            showMenu()
            print("Выбрать: ")
            val select = scanner.nextLine().toInt()
            if (select != 3) {
                println("Пользователь выбрал: $select")
            } else {
                run = false
            }
        }
    }

    private fun showMenu() {
        val menu = arrayOf(
            "Добавить новую заявку", "Показать все заявки", "Завершить программу"
        )
        println("Меню:")
        for (i in menu.indices) {
            println("$i. ${menu[i]}")
        }
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val tracker = Tracker()
    StartUI.init(scanner, tracker)
}