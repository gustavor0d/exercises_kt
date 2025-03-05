package cond_basicas

fun main() {
    println("Digite um ano:")
    val ano = readln().toIntOrNull() ?: 0

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
        println("O ano $ano é BISSEXTO!")
    else
        println("O ano $ano NÃO É BISSEXTO!")
}