package cond_basicas

fun main() {
    println("Digite seu nome:")
    val nome = readln()

    println("Digite seu sexo [M] para Masculino e [F] para Feminino:")
    val sexo: Char = readln().firstOrNull() ?: ' '

    println("Digite o valor das compras:")
    val valorTotal = readln().toDoubleOrNull() ?: 0.0

    if (sexo == 'M') {
        val desconto = valorTotal * 0.95

        println("Você ganhou 5% de desconto por ser homem! Novo valor: ${"%.2f".format(desconto)}")
    } else if (sexo == 'F') {
        val desconto = valorTotal * 0.87

        println("Você ganhou 13% de desconto por ser mulher! Novo valor: ${"%.2f".format(desconto)}")
    } else {
        println("Sexo inválido!")
    }
}