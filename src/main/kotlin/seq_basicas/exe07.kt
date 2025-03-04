package seq_basicas

fun main() {
    println("Digite um número real:")
    val numeroReal = readln().toDouble()

    println("o dobro de $numeroReal é ${numeroReal * 2}\nA terça parte de $numeroReal é ${"%.4f".format((numeroReal / 3))}")
}