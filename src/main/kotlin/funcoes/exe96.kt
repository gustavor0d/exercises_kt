package funcoes

fun main() {
    println("Digite o valor da base:")
    val base = readln().toIntOrNull() ?: return println("Valor inválido.")

    println("Digite o valor do expoente:")
    val expoente = readln().toIntOrNull() ?: return println("Valor inválido.")

    println("$base elevado a $expoente é: ${potencia(base, expoente)}")
}

fun potencia(v1: Int, v2: Int): Int {
    var resultado = 1
    for (i in 1..v2) {
        resultado *= v1
    }
    return resultado
}