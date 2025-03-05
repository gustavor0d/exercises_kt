package rep_enquanto

fun main() {
    println("Digite um número inteiro positivo:")
    val valor = readln().toIntOrNull() ?: 0

    var contagem = 1

    while ( contagem <= valor ) {
        print("$contagem ")
        contagem++
    }
    println("Acabou!")
}