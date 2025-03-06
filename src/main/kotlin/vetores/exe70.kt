package vetores

fun main() {
    val vetor = mutableListOf<Int>()

    for (i in 9 downTo 0) {
        vetor.add(i)
    }
    for (i in 0 until vetor.size) {
        print(" $i - ")
        println("${vetor[i]}")
    }
}