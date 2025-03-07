package procedimentos

fun main() {
    println("Digite um valor:")
    val v1 = readln().toDoubleOrNull() ?: return println("Valor inválido")

    println("Digite outro valor:")
    val v2 = readln().toDoubleOrNull() ?: return println("Valor inválido")

    maior(v1, v2)
}

fun maior(valor1: Double, valor2: Double) {
    if (valor1 > valor2) println("$valor1 MAIOR")
    else if (valor1 < valor2) println("$valor2 MAIOR")
    else println("Valores iguais!")
}