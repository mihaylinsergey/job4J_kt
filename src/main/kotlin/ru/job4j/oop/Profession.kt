package ru.job4j.oop

open class Profession(val education : String) {

    open fun getName() : String {
        return education
    }

    open fun action() {
        println("execute some actions")
    }
}

class Doctor(education : String, internship : String) : Profession(education) {

    override fun getName() : String {
        println("getName from Doctor")
        return super.getName()
    }

    override fun action() {
        super.action()
        println("action from Doctor")
    }
}

class Programmer(education : String, language : String) : Profession(education) {

    override fun getName() : String {
        println("getName from Programmer")
        return super.getName()
    }

    override fun action() {
        super.action()
        println("action from Programmer")
    }
}

class Manager(education : String, salary : String) : Profession(education) {

    override fun getName() : String {
        println("getName from Manager")
        return super.getName()
    }

    override fun action() {
        super.action()
        println("action from Manager")
    }
}

fun main() {
    val profession = Doctor("Doctor", "hospital")
    println(profession.getName())
    profession.action()
}
