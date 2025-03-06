package vetores

fun main() {
    val vetor = mutableListOf<Int>()

    var valor = 5

    for (i in 1..10) {
        if (valor == 5) {
            vetor.add(valor)
            valor = 3
        }
        else {
            vetor.add(valor)
            valor = 5
        }

    }
    for (i in 0 until vetor.size) {
        print(" $i - ")
        println("${vetor[i]}")
    }
}