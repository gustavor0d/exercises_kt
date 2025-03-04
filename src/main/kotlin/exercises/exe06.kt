package exercises

fun main() {
    println("Digite um número inteiro:")
    val numero = readln().toInt()

    println("O antecessor de $numero é ${numero - 1} e o seu sucessor é ${numero + 1}")
}