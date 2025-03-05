package rep_enquanto

fun main() {
    var listaIdades = mutableListOf<Int>()
    var pessoasMais18 = 0
    var pessoasMenos5 = 0

    var contador = 1

    while (contador <= 10) {
        println("Digite a idade [$contador/10]:")
        val idade = readln().toIntOrNull() ?: 0
        listaIdades.add(idade)
        if (idade > 18) pessoasMais18++
        else if (idade < 5) pessoasMenos5++
        contador++
    }

    println("Média da idade do grupo: ${listaIdades.average()}")
    println("Quantidade + de 18 anos do grupo: ${pessoasMais18}")
    println("Quantidade - de 5 anos do grupo: ${pessoasMenos5}")
    println("Maior idade do grupo: ${listaIdades.max()}")
}