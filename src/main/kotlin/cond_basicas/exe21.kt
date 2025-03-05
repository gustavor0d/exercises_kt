package cond_basicas

fun main() {
    println("Digite o ano de seu nascimento:")
    val anoNascimento = readln().toIntOrNull() ?: 0

    val idade = 2025 - anoNascimento

    if (idade > 18) {
        val diferenca = idade - 18

        println("Já se passaram $diferenca anos do seu alistamento.")
    } else if (idade < 18) {
        val diferenca = 18 - idade

        println("Ainda faltam $diferenca anos para seu alistamento.")
    } else {
        println("Você têm 18 anos e está apto para se alistar.")
    }
}