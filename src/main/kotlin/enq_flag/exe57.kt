package enq_flag

fun main() {
    var listaIdades = mutableListOf<Int>()
    var listaHomens = mutableListOf<Int>()
    var listaMulheres = mutableListOf<Int>()
    var homens = 0
    var mulheres = 0

    while (true) {
        println("(Digite qualquer coisa para continuar ou [S] para SAIR):")
        var opcao = readln().firstOrNull() ?: ' '
            opcao = opcao.uppercaseChar()
        if (opcao == 'S') break

        println("Digite seu sexo. [H] para Homem | [M] para Mulher:")
        var sexo = readln().firstOrNull()

        println("Digite sua idade:")
        val idade = readln().toIntOrNull()

        if (sexo == null || idade == null) {
            println("Digite valores válidos para as perguntas!")
            continue
        } else {
            sexo = sexo.uppercaseChar()

            listaIdades.add(idade)

            when (sexo) {
                'H' -> {
                    listaHomens.add(idade)
                    homens++
                }
                'M' -> {
                    listaMulheres.add(idade)
                    mulheres++
                }
                else -> {
                    println("Você digitou o sexo inválido.")
                    continue
                }
            }
        }
    }
    println("Programa encerrado.")

    if (listaIdades.size > 0) {
        println("Maior idade da lista: ${listaIdades.max()}")
        println("Quantidade de homens cadastrados: $homens")
        println("Idade da mulher mais jovem: ${listaMulheres.min()}")
        println("Média das idades entre os homens: %.2f".format(listaHomens.average()))
    } else
        println("Não foram atribuidas idades.")
}