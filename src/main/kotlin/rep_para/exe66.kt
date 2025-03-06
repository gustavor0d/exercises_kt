package rep_para

fun main() {
    val listaPesoMulheres = mutableListOf<Double>()
    val listaPesoHomens = mutableListOf<Double>()

    for (i in 1..8) {
        println("Digite o sexo. [M] para mulher ou [H] para homem:")
        var sexo = readln().firstOrNull()

        println("Digite o peso:")
        val peso = readln().toDoubleOrNull()

        if (sexo != null && peso != null) {
            sexo = sexo.uppercaseChar()
            if (sexo == 'H') listaPesoHomens.add(peso)
            if (sexo == 'M') listaPesoMulheres.add(peso)
        } else
            println("Entrada inválida!")
    }

    if ((listaPesoMulheres.size + listaPesoHomens.size) > 0) {
        println("Quantidade de mulheres cadastradas: ${listaPesoMulheres.count()}")
        println("Quantidade de homens que pesam mais de 100kg: ${listaPesoHomens.count { it > 100 }}")
        println("A média de peso entre as mulheres: %.2f".format(listaPesoMulheres.average()))
        println("O maior peso entre os homens: ${listaPesoHomens.max()}")
    } else
        print("Não foram entradas valores de sexo e peso.")
}