package rep_faca_enquanto

fun main() {
    var contagem = 0

    do {
        print("${contagem} ")
        contagem += 3
    } while (contagem <= 30)
    println("Acabou!")
}