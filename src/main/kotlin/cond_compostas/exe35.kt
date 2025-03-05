package cond_compostas

fun main() {
    println("Digite seu salário atual:")
    val salario = readln().toDoubleOrNull() ?: 0.0

    println("Digite seu gênero. [M] para Mulher [H] para Homem: ")
    var genero = readln().firstOrNull() ?: ' '
    genero = genero.uppercaseChar()

    println("Quantos anos trabalha na empresa:")
    val anosEmpresa = readln().toIntOrNull() ?: 0

    var salarioNovo = salario

    if (genero == 'M') {
        if (anosEmpresa < 15) salarioNovo *= 1.05
        else if (anosEmpresa in 15..20) salarioNovo *= 1.12
        else salarioNovo *= 1.23
    } else if (genero == 'H') {
        if (anosEmpresa < 20) salarioNovo *= 1.03
        else if (anosEmpresa in 20..30) salarioNovo *= 1.13
        else salarioNovo *= 1.25
    } else println("Você forneceu seu gênero errado.")

    println("Novo salário com base em $anosEmpresa anos de empresa: R$%.2f".format(salarioNovo))
}