package com.example.project5

class Dice(val sides : Int) {
    fun roll(): Int{
        return (1..sides).random()
    }
}