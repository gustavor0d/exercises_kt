package rep_enquanto

import kotlin.random.Random

fun main() {
    var acima5 = 0
    var divisivel3 = 0

    var contador = 1

    while (contador <= 20) {
        val numeroSorteado = Random.nextInt(1, 11)
        println("Número sorteado: $numeroSorteado")

        if (numeroSorteado > 5) acima5++
        else if (numeroSorteado % 3 == 0) divisivel3++

        contador++
    }
    println("Números a cima de 5: $acima5")
    println("Números divisíveis por 3: $divisivel3")
}