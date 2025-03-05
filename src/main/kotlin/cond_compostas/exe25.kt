package cond_compostas

fun main() {
    println("Digite o primeiro valor:")
    val primeiroValor = readln().toIntOrNull() ?: 0

    println("Digite o segundo valor:")
    val segundoValor = readln().toIntOrNull() ?: 0

    if (primeiroValor > segundoValor) println("O primeiro valor é maior.")
    else if (segundoValor > primeiroValor) println("O segundo valor é maior.")
    else println("Não existe valor maior, os dois são iguais.")
}