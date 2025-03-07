package procedimentos

fun main() {
    println("Digite o valor 1 para comparação:")
    val v1 = readln().toDoubleOrNull() ?: return println("Valor inválido!")

    println("Digite o valor 2 para comparação:")
    val v2 = readln().toDoubleOrNull() ?: return println("Valor inválido!")

    println("Digite o valor 3 para comparação:")
    val v3 = readln().toDoubleOrNull() ?: return println("Valor inválido!")

    maior02(v1, v2, v3)
}

fun maior02(valor1: Double, valor2: Double, valor3: Double) {
    if (valor1 == valor2 && valor2 == valor3) {
        println("Todos os valores são iguais.")
    } else if (valor1 > valor2 && valor1 > valor3) {
        println("$valor1 MAIOR")
    } else if (valor2 > valor1 && valor2 > valor3) {
        println("$valor2 MAIOR")
    } else if (valor3 > valor1 && valor3 > valor2) {
        println("$valor3 MAIOR")
    } else if (valor1 == valor2 && valor1 > valor3) {
        println("$valor1 MAIOR, porém valores iguais encontrados")
    } else if (valor1 == valor3 && valor1 > valor2) {
        println("$valor1 MAIOR, porém valores iguais encontrados")
    } else if (valor2 == valor3 && valor2 > valor1) {
        println("$valor2 MAIOR, porém valores iguais encontrados")
    } else {
        println("Valores iguais entre os três.")
    }
}