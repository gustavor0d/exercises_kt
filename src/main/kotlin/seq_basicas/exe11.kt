package seq_basicas

fun main() {
    println("Digite o valor de A:")
    val valorA = readln().toDouble()

    println("Digite o valor de B:")
    val valorB = readln().toDouble()

    println("Digite o valor de C:")
    val valorC = readln().toDouble()

    val delta = (valorB * valorB) - (4 * valorA * valorC)

    println("O valor de Delta é: $delta")
}