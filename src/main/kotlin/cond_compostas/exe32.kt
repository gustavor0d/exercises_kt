package cond_compostas

fun main() {
    println("Digite seu peso (Kg):")
    val peso = readln().toDouble()

    println("Digite sua altura (metros):")
    val altura = readln().toDouble()

    val imc = peso / (altura * altura)

    if (imc < 18.5) println("Abaixo do peso. IMC: %.4f".format(imc))
    else if (imc in 18.5..25.0) println("Peso ideal. IMC: %.4f".format(imc))
    else if (imc in 25.0..30.0) println("Sobrepeso. IMC: %.4f".format(imc))
    else if (imc in 30.0..40.0) println("Obesidade. IMC: %.4f".format(imc))
    else println("Obesidade mórbida. IMC: %.4f".format(imc))
}