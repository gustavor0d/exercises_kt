package exercises

fun main() {
    println("Digite seu salário:")
    val salario = readln().toDouble()

    val novoSalario = salario * 1.15

    println("Novo salário com aumento de 15%: R$${"%.2f".format(novoSalario)}")
}