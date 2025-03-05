package rep_enquanto

fun main() {
    println("Digite o valor inicial da contagem:")
    val valorInicial = readln().toIntOrNull() ?: 0

    println("Digite o valor final da contagem:")
    val valorFinal = readln().toIntOrNull() ?: 0

    println("Digite o icremento da contagem:")
    val icremento = readln().toIntOrNull() ?: 1

    var contador = valorInicial

    if (valorInicial < valorFinal) {
        while (contador <= valorFinal) {
            print("$contador ")

            if (icremento < 1) contador++
            else contador += icremento
        }
    } else {
        contador = valorFinal

        while (contador <= valorInicial) {
            print("$contador ")

            if (icremento < 1) contador++
            else contador += icremento
        }
    }
    println("Acabou!")
}