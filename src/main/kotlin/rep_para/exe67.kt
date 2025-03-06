package rep_para

fun main() {
    var valorA = 1
    var valorB = 1

    print("$valorA $valorB ")

    for (i in 1..8) {
        val proximo = valorA + valorB
        print("$proximo ")
        valorA = valorB
        valorB = proximo
    }
}