package cond_compostas

fun main() {
    println("Digite a largura do terreno:")
    val largura = readln().toDoubleOrNull() ?: 0.0

    println("Digite o comprimento do terreno:")
    val comprimento = readln().toDoubleOrNull() ?: 0.0

    val area = largura * comprimento

    if (area < 100.0) println("TERRENO POPULAR")
    else if (area in 100.0..500.0) println("TERRENO MASTER")
    else if (area > 500.0) println("TERRENO VIP")
}