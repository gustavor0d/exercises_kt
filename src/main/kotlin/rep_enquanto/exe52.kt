package rep_enquanto

fun main() {
    var mediaAltura = mutableListOf<Double>()
    var qtddMais90 = 0
    var qtddMenos50 = 0
    var qtddMais100 = 0

    var contador = 1

    while (contador <= 3) {
        println("Digite o peso da pessoa $contador:")
        var peso = readln().toDoubleOrNull() ?: 0.0

        println("Digite a altura da pessoa $contador:")
        var altura = readln().toDoubleOrNull() ?: 0.0

        mediaAltura.add(altura)

        if (peso > 100.0 && altura > 1.90) qtddMais100++
        if (peso > 90.0) qtddMais90++
        else if (peso < 50.0 && altura < 1.60) qtddMenos50++

        contador++
    }
    println("Média de altura do grupo: %.2f".format((mediaAltura.average())))
    println("Quantidade de pessoas que pesam mais de 90kg: $qtddMais90")
    println("Quantidade de pessoas que pesam menos de 50kg tem menos de 1.60m: $qtddMenos50")
    println("Quantidade de pessoas que medem mais de 1.90m pesam mais de 100kg: $qtddMais100")
}