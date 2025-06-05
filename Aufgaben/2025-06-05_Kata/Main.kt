package org.example

fun main() {
    for (i in 1..100) {
        if (i % 3 == 0 || i % 5 == 0) {
            if (i % 3 == 0) {
                print("Fizz")
            }
            if (i % 5 == 0) {
                print("Buzz")
            }// Tobias Heilmann
            println()
        } else {
            println(i)
        }
    }
}
