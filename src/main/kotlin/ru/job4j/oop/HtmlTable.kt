package ru.job4j.oop

class HtmlTable {

    fun table(row: Int, cell: Int): String {
        return StringBuilder().apply {
            append("<table>")
            // TODO add row and cell
            append("</table>")
        }.toString()
    }
}