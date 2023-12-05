package ru.job4j.oop

class Tracker {

    private var items : MutableList<Item> = ArrayList()
    private var ids : Int = 1

    fun add(item : Item) : Item {
        item.id = ids++
        items.add(item)
        return item
    }

    fun findById(id : Int) : Item? {
        val index = indexOf(id)
        return if (index != -1) items[index] else null
    }

    fun  findAll() : List<Item>{
        return items.toList()
    }

    fun  findByName(key : String) : List<Item> {
        val result : MutableList<Item> = ArrayList()
        for (item in items) {
            if (item.name == key) {
                result.add(item)
            }
        }
        return result
    }

    private fun indexOf(id : Int) : Int {
        var rsl = -1
        var index = 0
        while (index < items.size) {
            if (items[index].id == id) {
                rsl = index
                break
            }
            index++
        }
        return rsl
    }

    fun replace(id : Int, item : Item) : Boolean {
        val index = indexOf(id)
        val rsl = index != -1
        if (rsl) {
            item.id = id
            items[index] = item
        }
        return rsl
    }

    fun delete(id: Int): Boolean {
        val index = indexOf(id)
        val rsl = index != -1
        if (rsl) {
            items.removeAt(index)
        }
        return rsl
    }
}