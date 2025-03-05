package rep_enquanto

fun main() {
    var soma = 0

    var contador = 500

    while (contador >= 0) {
        print("$contador + ")
        contador -= 50
        soma += contador
    }
    println("\nSoma = $soma")
}