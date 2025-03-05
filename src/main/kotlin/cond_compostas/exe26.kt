package cond_compostas

fun main() {
    println("Digite a primeira nota:")
    val primeiraNota = readln().toDoubleOrNull() ?: 0.0
    println("Digite a segunda nota:")
    val segundaNota = readln().toDoubleOrNull() ?: 0.0

    val media = (primeiraNota + segundaNota) / 2

    if (media in 0.0..4.9) println("REPROVADO")
    else if (media in 5.0..6.9) println("RECUPERAÇÃO")
    else if (media in 7.0..10.0) println("APROVADO")
    else println("Erro")
}