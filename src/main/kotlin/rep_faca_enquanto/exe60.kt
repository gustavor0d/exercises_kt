package rep_faca_enquanto

fun main() {
    val listaIdades = mutableListOf<Int>()
    var qtddIdadesMais21 = 0

    do {
        println("Digite uma idade (0 para encerrar o programa):")
        val idade = readln().toIntOrNull()

        if (idade != null) {
            if (idade <= 0) break
            else {
                listaIdades.add(idade)
                if (idade > 21) qtddIdadesMais21++
            }
        } else continue


    }while (true)

    if (listaIdades.size > 0) {
        println("Total de idades digitadas: ${listaIdades.size}")
        println("Média das idades digitadas: %.2f".format(listaIdades.average()))
        println("Total pessoas com mais de 21 anos: $qtddIdadesMais21")
    } else
        println("Nenhuma idade foi armazenada")
}