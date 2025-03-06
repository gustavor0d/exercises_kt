package vetores

fun main() {
    val vetor = mutableListOf<String>()

    for (i in 1..7) {
        println("Digite um nome:")
        val nome = readln()

        vetor.add(nome)
    }
    vetor.reverse()

    println(vetor)
}