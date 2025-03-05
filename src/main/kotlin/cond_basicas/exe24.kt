package cond_basicas

fun main() {
    println("Comprimento da reta 01:")
    val reta01 = readln().toDoubleOrNull() ?: return println("Entrada inválida!")
    println("Comprimento da reta 02:")
    val reta02 = readln().toDoubleOrNull() ?: return println("Entrada inválida!")
    println("Comprimento da reta 03:")
    val reta03 = readln().toDoubleOrNull() ?: return println("Entrada inválida!")

    if ((reta01 < (reta02 + reta03)) && (reta02 < (reta01 + reta03)) && (reta03 < (reta01 + reta02))) {
        println("É possível formar um triângulo!")
    } else {
        println("Não é possível formar um triângulo.")
    }
}