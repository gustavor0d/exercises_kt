package cond_basicas

fun main() {
    println("Qual a velocidade do carro em Km/h?")
    val velocidade = readln().toDouble()

    if (velocidade > 80.0) {
        println("Multado!")

        val valorMulta = (velocidade - 80.0) * 5

        println("Valor da multa: R$%.2f".format(valorMulta))
    } else {
        println("Dentro dos limites.")
    }
}