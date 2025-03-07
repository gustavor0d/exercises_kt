package procedimentos

fun main() {
    println("Digite um valor para somar:")
    val v1 = readln().toIntOrNull() ?: return println("Valor inválido")

    println("Digite outro valor para somar:")
    val v2 = readln().toIntOrNull() ?: return println("Valor inválido")

    somador(v1, v2)
}

fun somador(valor1: Int, valor2: Int) {
    val soma = valor1 + valor2
    println("$valor1 + $valor2 = $soma")
}