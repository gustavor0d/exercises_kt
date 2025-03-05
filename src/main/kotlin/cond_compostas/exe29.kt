package cond_compostas

fun main() {
    println("Comprimento da reta 01:")
    val reta01 = readln().toDoubleOrNull() ?: return println("Entrada inválida!")
    println("Comprimento da reta 02:")
    val reta02 = readln().toDoubleOrNull() ?: return println("Entrada inválida!")
    println("Comprimento da reta 03:")
    val reta03 = readln().toDoubleOrNull() ?: return println("Entrada inválida!")

    if ((reta01 < (reta02 + reta03)) && (reta02 < (reta01 + reta03)) && (reta03 < (reta01 + reta02))) {
        println("É possível formar um triângulo!")

        if (reta01 == reta02 && reta02 == reta03)
            println("Triângulo EQUILÁTERO: Todos os lados iguais.")
        else if (reta01 == reta02 || reta02 == reta03 || reta01 == reta03)
            println("Triângulo ISÓSCELES: Dois lados iguais.")
        else
            println("Triângulo ESCALENO: Todos os lados diferentes.")

    } else {
        println("Não é possível formar um triângulo.")
    }
}