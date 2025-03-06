package vetores

import kotlin.random.Random

fun main() {
    val numerosAleatorios = mutableListOf<Int>()

    for (i in 1..30) {
        numerosAleatorios.add(Random.nextInt(1, 16))
    }
    println("Digite um valor entre 1 e 15 para encontrar na lista:")
    val chave = readln().toIntOrNull() ?: 0

    if (chave in numerosAleatorios){
        println("O primeiro valor encontrado na lista está na posição: ${(numerosAleatorios.indexOf(chave) + 1)}")
        println("O valor foi sorteado ${numerosAleatorios.count { it == chave }} vezes.")
    } else
        println("Valor não encontrado!")
}