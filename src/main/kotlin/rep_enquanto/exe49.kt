package rep_enquanto

fun main() {
    var listaNumeros = mutableListOf<Double>()

    var contador = 1

    while (contador <= 8) {
        println("Digite o valor do produto [$contador/8]:")
        val numero = readln().toDoubleOrNull() ?: 0.0
        listaNumeros.add(numero)
        contador ++
    }
    println("Maior valor digitado: ${listaNumeros.max()}")
    println("Menor valor digitado: ${listaNumeros.min()}")
}