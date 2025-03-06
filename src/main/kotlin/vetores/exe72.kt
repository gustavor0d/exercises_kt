package vetores

fun main() {
    var valorA = 1
    var valorB = 1

    val listaFibonacci = mutableListOf(valorA, valorB)

    for (i in 1 until 15) {
        val proximoValor = valorA + valorB
        valorA = valorB
        valorB = proximoValor
        listaFibonacci.add(proximoValor)
    }
    for (i in 0 until listaFibonacci.size) {
        print(" $i - ")
        println("${listaFibonacci[i]}")
    }
}