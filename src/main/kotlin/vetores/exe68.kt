package vetores

fun main() {
    val vetor = listOf(999, 999, 999, 999, 999, 999, 999, 999)

    for (i in 0 until vetor.size) {
        print(" $i - ")
        println("${vetor[i]}")
    }
}