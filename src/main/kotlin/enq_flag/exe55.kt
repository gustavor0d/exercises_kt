package enq_flag

fun main() {
    var salarioMasculino = 0.0
    var salarioFeminino = 0.0

    while (true) {
        println("Digite seu salário:")
        val salario = readln().toDoubleOrNull()

        println("Digite seu sexo. [M] para Masculino | [F] para Feminino:")
        var sexo = readln().firstOrNull()

        if (salario == null || sexo == null) {
            println("Digite valores válidos para as perguntas!")
            continue
        } else {
            sexo = sexo.lowercaseChar()

            when (sexo) {
                'm' -> salarioMasculino += salario
                'f' -> salarioFeminino += salario
                else -> {
                    println("Você digitou o sexo inválido.")
                    continue
                }
            }
        }
        println("(Deseja continuar? [S] para sim [N] para encerrar)")
        var opcao = readln().firstOrNull() ?: 's'
        opcao = opcao.lowercaseChar()
        if (opcao == 's') continue
        else break
    }
    println("Programa encerrado.")

    println("Somatório dos salários dos homens: R$%.2f".format(salarioMasculino))
    println("Somatório dos salários das mulheres: R$%.2f".format(salarioFeminino))
}