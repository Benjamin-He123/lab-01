package com.example.petshop

abstract class Mood(val name: String, val date:String) {
    abstract fun speak(): String
}