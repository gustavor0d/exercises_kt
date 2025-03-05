package rep_enquanto

fun main() {
    var somatorio = 0

    var contador = 1

    while (contador <= 7) {
        println("[$contador/7] Digite um número:")
        val numero = readln().toIntOrNull() ?: 0
        contador ++
        somatorio += numero
    }
    println("Soma dos números digitados: $somatorio")
}