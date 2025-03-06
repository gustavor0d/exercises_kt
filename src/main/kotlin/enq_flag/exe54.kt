package enq_flag

fun main() {
    var somatorio = 0

    while (true) {
        println("Digite números para somatório  (1111 para sair):")
        val numero = readln().toIntOrNull()

        if (numero == null) {
            println("Digite um valor válido")
            continue
        }

        if (numero == 1111) {
            println("Programa encerrado")
            break
        } else {
            somatorio += numero
        }
    }

    println("Somatório: $somatorio")
}