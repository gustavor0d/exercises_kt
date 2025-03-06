package vetores

fun main() {
    val listaNotas = mutableListOf<Double>()

    for (i in 1..10) {
        println("Digite a nota do aluno $i:")
        val notas = readln().toDoubleOrNull()

        if (notas != null) listaNotas.add(notas)
    }

    var acimaMedia = 0

    for (i in listaNotas) {
        if (i > listaNotas.average()) acimaMedia++
    }

    val maioresNotas = listaNotas.mapIndexed { index, item -> index to item }
        .filter { it.second == listaNotas.max() }
        .map { it.first + 1 }

    println("Média de todas as notas: %.2f".format(listaNotas.average()))
    println("Quantidade de alunos acima da média: $acimaMedia")
    println("Maior nota digitada: ${listaNotas.max()}")
    println("Posições que foram digitadas as pessoas com maiores notas: $maioresNotas")
}