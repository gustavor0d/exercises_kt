package rep_para

fun main() {
    println("Digite um número:")
    val numero = readln().toIntOrNull()

    if (numero == null) {
        println("Número inválido.")
    } else {
        for (i in 1..10) {
            println("$numero x $i = ${numero * i}")
        }
    }
}