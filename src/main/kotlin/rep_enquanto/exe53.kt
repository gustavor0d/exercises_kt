package rep_enquanto

import kotlin.random.Random

fun main() {
    val computador = Random.nextInt(1, 11)

    var tentativas = 4

    while (tentativas >= 1) {
        println("Você tem ${tentativas--} tentativas para tentar acertar")
        println("Digite um número entre 1 e 10 para descobrir qual foi sorteado pelo computador:")
        val opcao = readln().toIntOrNull() ?: 0

        if (opcao == computador)
            return println("Você acertou!! Número sorteado: $computador")
        else if (tentativas in 1..4) println("Você errou! Tente novamente...")
        else println("Você perdeu. Número sorteado: $computador")
    }
}