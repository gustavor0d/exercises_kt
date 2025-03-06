package rep_faca_enquanto

fun main() {
    val numeros = mutableListOf<Int>()
    var numerosPares = 0

    do {
        println("Digite um número (0 para encerrar o programa):")
        val numero = readln().toIntOrNull()

        if (numero != null) {
            if (numero <= 0) break
            else {
                numeros.add(numero)
                if (numero % 2 == 0) numerosPares++
            }
        } else continue
    }while (true)

    if (numeros.size > 0) {
        println("Somatório dos números: ${numeros.sum()}")
        println("Menor valor digitado: ${numeros.min()}")
        println("Média dos números: %.2f".format(numeros.average()))
        println("Quantidade de valores pares: $numerosPares")
    } else
        println("Nenhuma idade foi armazenada")
}