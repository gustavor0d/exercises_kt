package enq_flag

fun main() {
    val nomesPessoas = mutableListOf<String>()
    val nomesMulheres = mutableListOf<String>()
    val idadesPessoas = mutableListOf<Int>()
    val idadesMulheres = mutableListOf<Int>()
    var homensMais30 = 0
    var mulheresMenos18 = 0

    while (true) {
        println("(Digite qualquer coisa para continuar ou [S] para SAIR):")
        var opcao = readln().firstOrNull() ?: ' '
        opcao = opcao.uppercaseChar()
        if (opcao == 'S') break

        println("Digite seu nome:")
        val nome = readln()

        println("Digite sua idade:")
        val idade = readln().toIntOrNull() ?: 0

        if (idade <= 0 || idade > 100) {
            println("Idade inválida!")
            continue
        }

        println("Digite seu sexo. [H] para Homem | [M] para Mulher:")
        var sexo = readln().firstOrNull()

        if (sexo == null) {
            println("Digite valores válidos para as perguntas!")
            continue
        } else {
            sexo = sexo.uppercaseChar()

            nomesPessoas.add(nome)
            idadesPessoas.add(idade)

            when (sexo) {
                'H' -> if (idade > 30) homensMais30++
                'M' -> {
                    nomesMulheres.add(nome)
                    idadesMulheres.add(idade)

                    if (idade < 18) mulheresMenos18++
                }
                else -> {
                    println("Você digitou o sexo inválido.")
                    continue
                }
            }
        }
    }
    println("Programa encerrado.")

    if (nomesPessoas.size > 0) {
        val indicePessoaVelha = idadesPessoas.indexOf(idadesPessoas.max())
        val indiceMulherNova = idadesMulheres.indexOf(idadesMulheres.min())

        println("Quantidade total de pessoas: ${nomesPessoas.size}")
        println("O nome da pessoa mais velha: ${nomesPessoas[indicePessoaVelha]} que tem ${idadesPessoas.max()} anos.")
        println("O nome da mulher mais jovem: ${nomesMulheres[indiceMulherNova]} que tem ${idadesMulheres.min()} anos.")
        println("A média da idade das pessoas: %.2f".format(idadesPessoas.average()))
        println("Quantidade de homens com mais de 30 anos: $homensMais30")
        println("Quantidade de mulheres com menos de 18 anos: $mulheresMenos18")
    } else
        println("Não foram atribuidas pessoas.")
}