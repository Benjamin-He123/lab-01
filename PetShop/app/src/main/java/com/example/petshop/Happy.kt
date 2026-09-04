package com.example.petshop

class Happy(name: String, date: String): Mood(name, date) {
    override fun speak(): String {
        return "I am $name"
    }
}