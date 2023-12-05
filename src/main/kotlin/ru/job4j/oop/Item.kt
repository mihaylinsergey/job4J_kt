package ru.job4j.oop

import java.time.LocalDateTime

class Item {

    private var id: Int = 0

    private var name: String = ""

    private var created: LocalDateTime = LocalDateTime.now()

    constructor() {}

    constructor(name: String) {
        this.name = name
    }

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    fun getId(): Int {
        return id
    }

    fun setId(value: Int) {
        id = value
    }

    fun getName(): String {
        return name
    }

    fun setName(value: String) {
        name = value
    }

    fun getCreated(): LocalDateTime {
        return created
    }

    fun setCreated(value: LocalDateTime) {
        created = value
    }
}