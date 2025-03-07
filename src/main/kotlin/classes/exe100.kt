package classes

fun main() {
    val meuCarro = Carro(marca = "Audi", modelo = "A3", ano = 2010)

    println("Informações do meu veículo:")
    println("Marca: ${meuCarro.marca}\tModelo: ${meuCarro.modelo}\tAno: ${meuCarro.ano}")

    println("Status do carro: ${meuCarro.statusCarro}")
    meuCarro.ligar()
    println("Status do carro: ${meuCarro.statusCarro}")
    meuCarro.ligar()

    meuCarro.desligar()
    println("Status do carro: ${meuCarro.statusCarro}")
    meuCarro.desligar()
}

class Carro(
    var marca: String,
    var modelo: String,
    var ano: Int,
) {

    var statusCarro = "Desligado"

    fun ligar() {
        if (statusCarro == "Desligado") {
            println("Ligando o carro.")
            statusCarro = "Ligado"
        } else
            println("O carro já está ligado!")
    }

    fun desligar() {
        if (statusCarro == "Ligado") {
            println("Desligando o carro.")
            statusCarro = "Desligado"
        } else
            println("O carro já está desligado!")
    }
}