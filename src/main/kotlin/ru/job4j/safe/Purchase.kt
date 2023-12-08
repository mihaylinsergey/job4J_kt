package ru.job4j.safe

import java.util.*

data class Address(val street: String, val home: String, val zip: String)

class Purchase(val name: String, val created: Date, val address: Address? = null)

fun generateHtmlTable(purchases: List<Purchase>): String {
    return with(StringBuilder()) {
        append("<table>\n")
        append("<tr><th>Name</th><th>Created</th><th>Address</th></tr>\n")
        for (purchase in purchases) {
            append("<tr>")
            append("<td>${purchase.name}</td>")
            append("<td>${purchase.created}</td>")
            append("<td>${purchase.address?.let { "${it.street}, ${it.home}, ${it.zip}" } ?: ""}</td>")
            append("</tr>\n")
        }
        append("</table>")
        toString()
    }
}

fun main() {
    val purchase1 = Purchase("Item 1", Date(), Address("Street1", "Home1", "Zip1"))
    val purchase2 = Purchase("Item 2", Date(), null)
    val purchase3 = Purchase("Item 3", Date(), Address("Street3", "Home3", "Zip3"))
    val purchases = listOf(purchase1, purchase2, purchase3)
    val htmlTable = generateHtmlTable(purchases)
    println(htmlTable)
}