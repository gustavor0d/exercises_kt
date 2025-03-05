package cond_basicas

fun main() {
    println("Digite um número inteiro:")
    val numero = readln().toIntOrNull() ?: 0

    if (numero % 2 == 0) println("O número $numero é PAR") else println("O número $numero é ÍMPAR")
}