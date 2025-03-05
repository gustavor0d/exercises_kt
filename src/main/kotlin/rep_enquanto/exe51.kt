package rep_enquanto

fun main() {
    var grupoPessoas = mutableListOf<Int>()
    var grupoHomens = mutableListOf<Int>()
    var qtddHomens = 0
    var qtddMulheres = 0
    var qtddMulheresMais20 = 0

    var contador = 1

    while (contador <= 5) {
        println("Digite a idade da pessoa $contador:")
        var idade = readln().toIntOrNull() ?: 0

        println("Digite o sexo da pessoa $contador [M] para mulher [H] para homem:")
        var sexo = readln().firstOrNull() ?: ' '
        sexo = sexo.uppercaseChar()

        if (sexo == 'M') {
            qtddMulheres++
            if (idade > 20) qtddMulheresMais20++
        } else if (sexo == 'H') {
            qtddHomens++
            grupoHomens.add(idade)
        }
        else println("Sexo inválido!")

        grupoPessoas.add(idade)

        contador++
    }

    println("Quantidade de homens cadastrados: $qtddHomens")
    println("Quantidade de mulheres cadastradas: $qtddMulheres")
    println("Média de idade do grupo de pessoas: %.2f".format((grupoPessoas.average())))
    println("Média de idade do grupo de homens: %.2f".format((grupoHomens.average())))
    println("Quantidade de mulheres com mais de 20 anos: $qtddMulheresMais20")
}