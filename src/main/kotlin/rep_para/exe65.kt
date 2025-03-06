package rep_para

fun main() {
    println("Digite um número positivo:")
    val numero = readln().toIntOrNull()

    if (numero == null) {
        println("Número inválido.")
    } else {
        for (i in 0..numero) {
            print("$i, ")
        }
        println("FIM!")
    }
}