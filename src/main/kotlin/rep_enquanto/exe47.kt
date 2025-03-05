package rep_enquanto

fun main() {
    var pares = 0
    var impares = 0

    var contador = 1

    while (contador <= 6) {
        println("[$contador/6] Digite um número:")
        val numero = readln().toIntOrNull() ?: 0

        if (numero % 2 == 0) pares++
        else impares++

        contador++
    }
    println("Quantidade digitada de números pares: $pares")
    println("Quantidade digitada de números ímpares: $impares")
}