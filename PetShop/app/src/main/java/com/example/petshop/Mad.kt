package com.example.petshop

class Mad(name: String, date: String): Mood(name, date) {
    override fun speak(): String {
        return "I am $name"
    }
}