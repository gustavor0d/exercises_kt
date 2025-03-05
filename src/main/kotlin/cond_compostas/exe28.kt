package cond_compostas

fun main() {
    println("Digite seu nome:")
    val nome = readln()

    println("Digite seu salário:")
    val salario = readln().toDoubleOrNull() ?: 0.0

    println("Tem de empresa (em anos):")
    val anoEmpresa = readln().toInt()

    if (anoEmpresa < 3) {
        val novoSalario = salario * 1.03

        println("Novo salário de $nome com $anoEmpresa anos de empresa: R$%.2f".format(novoSalario))
    } else if (anoEmpresa in 3..10) {
        val novoSalario = salario * 1.125

        println("Novo salário de $nome com $anoEmpresa anos de empresa: R$%.2f".format(novoSalario))
    } else {
        val novoSalario = salario * 1.2

        println("Novo salário de $nome com $anoEmpresa anos de empresa: R$%.2f".format(novoSalario))
    }
}