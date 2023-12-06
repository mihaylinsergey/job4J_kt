package ru.job4j.lambda

import java.time.Instant
import java.util.*

data class Campaign(val name: String, val address: Address, val created: Date)

class Address(val City : String, val Street : String)

fun mapCampaign(list : List<Campaign>) : List<String> {
    return list.map { it.toString()}
}

fun main() {
    val list = listOf(
        Campaign("Name1", Address("City1", "Street1"), Date.from(Instant.now())),
        Campaign("Name2", Address("City2", "Street2"), Date.from(Instant.now())),
        Campaign("Name3", Address("City3", "Street3"), Date.from(Instant.now()))
    )
    println(mapCampaign(list))
}