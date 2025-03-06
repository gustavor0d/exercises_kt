package vetores

fun main() {
    val listaNomes = mutableListOf<String>()
    val listaSexo = mutableListOf<Char>()
    val listaSalarios = mutableListOf<Double>()

    for (i in 1..5) {
        println("Digite o NOME da pessoa $i:")
        val nome = readln().replaceFirstChar { it.uppercaseChar() }

        println("Digite o SEXO da pessoa $i - [M] para Mulher | [H] para Homem:")
        val sexo = readln().replaceFirstChar { it.uppercaseChar() }.firstOrNull()

        println("Digite o SALÁRIO da pessoa $i:")
        val salario = readln().toDoubleOrNull()

        if (sexo == 'M' || sexo == 'H') {
            if (salario != null) {
                listaNomes.add(nome)
                listaSexo.add(sexo)
                listaSalarios.add(salario)
            } else {
                println("Salario inválido!")
                continue
            }
        } else {
            println("Sexo inválido!")
            continue
        }
    }
    for (i in listaNomes.indices) {
        if (listaSexo[i] == 'M' && listaSalarios[i] > 5_000.0) {
            println("Nome: ${listaNomes[i]} - Sexo: ${listaSexo[i]}ulher - Salário superior > 5k: R$${"%.2f".format(listaSalarios[i])}")
        }
    }
}