package com.example.lib

fun main(){
    val checkNumber = 7
    val result = if(isEven(checkNumber))"Even" else "Odd"
    println(result)
}
val squareNumber: (Int) -> Int = { a -> a * a }
val isEven:(Int)-> Boolean ={number -> number % 2 == 0}

