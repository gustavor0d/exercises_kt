package funcoes

fun main() {
    println("Digite o primeiro valor:")
    val valor1 = readln().toIntOrNull() ?: return println("Valor inválido.")

    println("Digite o segundo valor:")
    val valor2 = readln().toIntOrNull() ?: return println("Valor inválido.")

    println("= ${superSomador(valor1, valor2)}")
}

fun superSomador(v1: Int, v2: Int): Int {
    var somador = 0
    for (i in v1..v2) {
        print("$i + ")
        somador += i
    }
    println()
    return somador
}