package vetores

import kotlin.random.Random

fun main() {
    val numerosAleatorios = mutableListOf<Int>()

    for (i in 1..7) {
        numerosAleatorios.add(Random.nextInt(1, 5000))
    }
    print(numerosAleatorios)
}