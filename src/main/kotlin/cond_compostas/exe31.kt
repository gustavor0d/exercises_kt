package cond_compostas

fun main() {
    println("Qual o valor da casa:")
    val valorCasa = readln().toDouble()

    println("Digite seu salário:")
    val salario = readln().toDouble()

    println("Em quantos anos pretende pagar:")
    val anos = readln().toInt()

    val porcentSalario = salario * 0.3
    val qtddMeses = anos * 12
    val prestacaoMensal = valorCasa / qtddMeses

    if (prestacaoMensal < porcentSalario)
        println("Empréstimo aceito! Prestação mensal: R$%.2f.".format(prestacaoMensal))
    else
        println("Empréstimo negado! Prestação mensal de R$${"%.2f".format(prestacaoMensal)} ultrapassa 30% do seu salário, que é equivalente a R$${"%.2f".format(porcentSalario)}.")
}