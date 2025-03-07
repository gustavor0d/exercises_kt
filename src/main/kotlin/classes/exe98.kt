package classes

fun main() {
    val pessoa01 = Pessoa(nome = "Gustavo", sexo = "Masculino", idade = 22)
    val pessoa02 = Pessoa(nome = "Murilo", sexo = "Masculino", idade = 19)
    val pessoa03 = Pessoa(nome = "Maria", sexo = "Feminino", idade = 26)
}

class Pessoa(
    var nome: String,
    var sexo: String,
    var idade: Int,
) {
    init {
        println("Nova pessoa criada!")
        println("Nome: $nome    Sexo: $sexo    Idade: $idade")
    }
}