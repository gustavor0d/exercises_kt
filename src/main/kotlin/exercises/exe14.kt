package exercises

fun main() {
    println("Digite a quantidade de Kms percorridos:")
    val kmsPercorridos = readln().toDouble()
    println("Quantidade de dias alugado:")
    val diasAlugado = readln().toIntOrNull() ?: 0

    val diaria = 90.0
    val kmRodado = 0.20

    val valorTotal = (diasAlugado * diaria) + (kmsPercorridos * kmRodado)

    println("Total a pagar: R$%.2f".format(valorTotal))
}