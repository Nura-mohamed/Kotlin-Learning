package com.example.lib

fun main() {
    val foodTimetable = checkFood(days ="Monday")
    println(foodTimetable)
}

fun checkFood(days: String): String {
    return when (days) {
        "Monday" -> "chapo beans"
        "Tuesday" -> "wheat"
        "Wednesday" -> "rice"
        "Thursday" -> "chips "
        "Friday" -> "pilau"
        "Saturday" -> "rice beans"
        "Sunday" -> "chapo"
        else ->
            "want to change menu"

    }
}
