package ru.job4j.oop

open class Profession(val education : String)

class Doctor(education : String, internship : String) : Profession(education)

class Programmer(education : String, language : String) : Profession(education)

class Manager(education : String, salary : String) : Profession(education)