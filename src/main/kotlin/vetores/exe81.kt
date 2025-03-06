package vetores

fun main() {
    val listaNomes = mutableListOf<String>()
    val listaIdades = mutableListOf<Int>()

    for (i in 1..9) {
        println("Digite o NOME da pessoa $i:")
        val nome = readln()
        println("Digite a IDADE da pessoa $i:")
        val idade = readln().toIntOrNull()

        if (idade != null) {
            listaNomes.add(nome)
            listaIdades.add(idade)
        }
    }
    for ((nome, idade) in listaNomes.zip(listaIdades)) {
        if (idade < 18) {
            println("${nome.replaceFirstChar { it.uppercaseChar() }} é MENOR de idade e tem $idade anos.")
        }
    }
}