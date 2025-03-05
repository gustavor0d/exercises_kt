package cond_compostas

fun main() {
    println("Quantas horas de atividade física tive no mês:")
    val horasAtividade = readln().toIntOrNull() ?: 0

    var pontos = 0
    var dinheiro = 0.5

    if (horasAtividade <= 10) {
        pontos = horasAtividade * 2
        dinheiro *= pontos
    } else if (horasAtividade in 10..20) {
        pontos = horasAtividade * 5
        dinheiro *= pontos
    } else {
        pontos = horasAtividade * 10
        dinheiro *= pontos
    }
    println("Dinheiro ganho por $horasAtividade horas de atividade física no mês: R$%.2f".format(dinheiro))
    println("Pontos acumulados: $pontos")
}