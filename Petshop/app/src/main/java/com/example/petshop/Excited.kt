package com.example.petshop

class Excited(date: String) : Mood(date) {
    override fun printMood(): String {
        return "Excited"
    }
}