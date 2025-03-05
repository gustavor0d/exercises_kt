package cond_compostas

fun main() {
    println("Digite o carro que você utilizou. (Popular) ou (Luxo):")
    var carroAlugado = readln().firstOrNull() ?: ' '
    carroAlugado = carroAlugado.uppercaseChar()

    println("Quantos dias foi alugado:")
    val diasAlugado = readln().toIntOrNull() ?: 0

    println("Km's percorridos:")
    val kmsPercorrido = readln().toDoubleOrNull() ?: 0.0

    val aluguelPopular = 90
    val aluguelLuxo = 150

    if (carroAlugado == 'P') {
        if (kmsPercorrido <= 100.0) {
            val valorKm = 0.2

            val valorPagar = (aluguelPopular * diasAlugado) + (kmsPercorrido * valorKm)

            println("Valor a pagar pelo carro popular: %.2f".format(valorPagar))
        } else {
            val valorKm = 0.1

            val valorPagar = (aluguelPopular * diasAlugado) + (kmsPercorrido * valorKm)

            println("Valor a pagar pelo carro popular: %.2f".format(valorPagar))
        }
    } else if (carroAlugado == 'L') {
        if (kmsPercorrido <= 200.0) {
            val valorKm = 0.3

            val valorPagar = (aluguelLuxo * diasAlugado) + (kmsPercorrido * valorKm)

            println("Valor a pagar pelo carro de luxo: %.2f".format(valorPagar))
        } else {
            val valorKm = 0.25

            val valorPagar = (aluguelLuxo * diasAlugado) + (kmsPercorrido * valorKm)

            println("Valor a pagar pelo carro de luxo: %.2f".format(valorPagar))
        }
    } else {
        println("Carro utilizado inválido!")
    }
}