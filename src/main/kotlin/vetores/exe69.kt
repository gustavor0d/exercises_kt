package vetores

fun main() {
    val vetor = mutableListOf<Int>()

    for (i in 5..50 step 5) {
        vetor.add(i)
    }
    for (i in 0 until vetor.size) {
        print(" $i - ")
        println("${vetor[i]}")
    }
}