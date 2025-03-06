package vetores

import kotlin.random.Random

fun main() {
    val numerosAleatorios = mutableListOf<Int>()

    for (i in 1..20) {
        numerosAleatorios.add(Random.nextInt(1, 100))
    }
    println(numerosAleatorios)

    numerosAleatorios.sort()

    println(numerosAleatorios)
}