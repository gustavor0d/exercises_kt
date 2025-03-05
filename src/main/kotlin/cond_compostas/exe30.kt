package cond_compostas

import kotlin.random.Random

fun main() {
    val computador = Random.nextInt(1, 6)

    println("Digite um número de 1 a 5 para descobrir qual foi sorteado pelo computador:")
    val opcao = readln().toIntOrNull() ?: 0

    if (opcao == computador) println("Você acertou!! Número sorteado: $computador")
    else println("Você errou! O número sorteado foi $computador")
}