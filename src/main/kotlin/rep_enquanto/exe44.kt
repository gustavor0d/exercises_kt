package rep_enquanto

fun main() {
    var soma = 0

    var contador = 6

    while (contador <= 100) {
        print("$contador + ")
        contador += 2
        soma += contador
    }
    println("\nSoma = $soma")
}