package seq_basicas

fun main() {
    println("Nome do funcionário:")
    var nomeFuncionario = readln()

    println("Salário:")
    var salario = readln().toDoubleOrNull() ?: 0

    println("O funcionário $nomeFuncionario tem um salário de R$${"%.2f".format(salario)}.")
}