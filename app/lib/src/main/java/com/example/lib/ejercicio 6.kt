package com.example.lib

fun main() {
    val numeros = listOf(4, 7, 12, 15, 8, 3, 22, 11, 6, 9)

    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()

    for (num in numeros) {
        if (num % 2 == 0) {
            pares.add(num)
        } else {
            impares.add(num)
        }
    }

    println("Pares: $pares")
    println("Impares: $impares")
}