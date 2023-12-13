package com.example.lib

fun main (){
    val clothes:String = checkWeather("rainy")
    println(clothes)
}
fun checkWeather(weather:String):String{
    return when (weather){
        "rainy"-> "raincoat"
        "sunny"-> "Vest"
        "Cold"->"sweater"
        else ->{
            "not found"
        }
    }
}

