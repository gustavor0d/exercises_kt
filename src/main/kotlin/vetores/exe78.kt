package vetores

fun main() {
    val listaIdades = mutableListOf<Int>()

    for (i in 1..8) {
        println("Digite a idade $i:")
        val idades = readln().toIntOrNull()

        if (idades != null) listaIdades.add(idades)
    }
    val posicoesMais25 = listaIdades.mapIndexed { index, item -> index to item }
        .filter { it.second > 25 }
        .map { it.first + 1 }

    val maioresIdade = listaIdades.mapIndexed { index, item -> index to item }
        .filter { it.second == listaIdades.max() }
        .map { it.first + 1 }

    println("Média de todas as idades: %.2f".format(listaIdades.average()))
    println("Posições que tem pessoas com mais de 25 anos: ${posicoesMais25}")
    println("Maior idade digitada: ${listaIdades.max()}")
    println("Posições que foram digitadas as pessoas com maior idade: ${maioresIdade}")
}