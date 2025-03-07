package procedimentos

fun main() {
    println("Digite o valor de ínicio do contador:")
    val ini = readln().toIntOrNull() ?: return println("Valor inválido!")

    println("Digite o valor de fim do contador:")
    val fim = readln().toIntOrNull() ?: return println("Valor inválido!")

    println("Digite o valor de icremento do contador:")
    val icrem = readln().toIntOrNull() ?: return println("Valor inválido!")

    contador(ini, fim, icrem)
}

fun contador(inicio: Int, fim: Int, icremento: Int) {
    if (inicio < fim && icremento > 0) {
        for (i in inicio..fim step icremento) {
            print("$i >> ")
        }
        println("FIM")
    } else
        println("Valor de ínicio menor que o de fim ou valor do icremento = 0")
}