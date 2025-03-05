package cond_basicas

fun main() {
    println("Qual a distância que deseja percorrer em Km:")
    val distancia = readln().toDoubleOrNull() ?: 0.0

    if (distancia <= 200.0) {
        val valorPagar = distancia * 0.5

        println("Sua viagem deu R$%.2f em ${distancia}km percorridos.".format(valorPagar))
    } else {
        val valorPagar = distancia * 0.45

        println("Sua viagem deu R$%.2f em ${distancia}km percorridos.".format(valorPagar))
    }
}