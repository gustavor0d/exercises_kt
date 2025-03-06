package vetores

fun main() {
    val vetor = mutableListOf<Int>()

    for (i in  1..10) {
        println("Digite um número:")
        val numero = readln().toIntOrNull()
        if (numero != null) vetor.add(numero)
    }
    println(vetor)
    for (i in 0 until vetor.size) {
        if (vetor[i] % 2 == 0)
            println("Valores pares: ${vetor[i]} Posição na lista: ${(vetor.indexOf(vetor[i])) + 1}")
    }
}