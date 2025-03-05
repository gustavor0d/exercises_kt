package cond_basicas

fun main() {
    println("Digite seu ano de nascimento:")
    val anoNascimento = readln().toIntOrNull() ?: 0
    val idade = 2025 - anoNascimento

    if (idade >= 18) print("Sua idade é $idade anos e você já pode votar")
    else print("Sua idade é $idade anos e você não pode votar")
}