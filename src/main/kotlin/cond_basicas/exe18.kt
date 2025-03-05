package cond_basicas

fun main() {
    println("Digite seu nome:")
    val nome = readln()

    println("Digite a primeira nota:")
    val primeiraNota = readln().toDoubleOrNull() ?: 0.0

    println("Digite a segunda nota:")
    val segundaNota = readln().toDoubleOrNull() ?: 0.0

    val mediaNotas = (primeiraNota + segundaNota) / 2

    if (mediaNotas > 7.0) println("Média das notas de $nome: $mediaNotas\nPortanto está Aprovado.")
    else println("Média das notas de $nome: $mediaNotas\nPortanto está Reprovado.")
}