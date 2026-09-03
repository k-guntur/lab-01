package com.example.petshop

//class Pet(val name: String, var age: Int) {
//}

//open class Pet(val name: String, var age: Int) {
//}

interface Pettable {
    fun pet()
}
abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}
