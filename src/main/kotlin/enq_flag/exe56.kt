package enq_flag

fun main() {
    var idades = mutableListOf<Int>()

    while (true) {
        println("Digite a idade do aluno (Se desejar sair digite: 999):")
        val idadeAluno = readln().toIntOrNull()

        if (idadeAluno == null){
            println("Digite uma idade válida.")
            continue
        } else {
            if (idadeAluno == 999) {
                println("Programa encerrrado.")
                break
            }
            else {
                idades.add(idadeAluno)
            }
        }
    }
    if (idades.size > 0) {
        println("Quantidade de alunos na turma: ${idades.size}")
        println("Média da idade da turma: %.2f".format(idades.average()))
    } else {
        println("Não foram digitadas idades.")
    }
}