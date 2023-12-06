package ru.job4j.lambda

data class Account(val name : String, val balance : Int)

fun filterAccount(list : List<Account>) : List<Account> {
    return list.filter { (name, balance) -> name == "Ivan" && balance > 0 }
}
