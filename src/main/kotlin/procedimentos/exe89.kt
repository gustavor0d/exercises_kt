package procedimentos

fun main() {
    println("Digite um número para verificar se é PAR ou ÍMPAR:")
    val numero = readln().toIntOrNull() ?: 0

    parouimpar(numero)
}

fun parouimpar(valor: Int) {
    if (valor % 2 == 0) println("$valor é PAR")
    else println("$valor é ÍMPAR")
}
