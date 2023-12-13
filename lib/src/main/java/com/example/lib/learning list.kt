package com.example.lib

fun main () {
    val numbers = mutableListOf("one", "five", "six")
    numbers.add(1, "two",)
    numbers.addAll(2, listOf("three", "four"))
    println(numbers)
}

val orderBooks = mutableListOf<String>("5am Club","Caucasian Chalk circle ","Betrayal City", "Blossoms of the Savannah")
val results = orderBooks.filter{name->
    name.contains(char = 'C',ignoreCase = true)
}

