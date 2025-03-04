package seq_basicas

fun main() {
    println("Digite um número inteiro:")
    var numero01 = readln().toIntOrNull() ?: 0
    println("Digite outro número inteiro:")
    var numero02 = readln().toIntOrNull() ?: 0

    var soma = numero01 + numero02

    println("A soma entre $numero01 e $numero02 é igual a $soma.")
}