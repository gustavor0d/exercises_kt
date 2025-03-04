package exercises

fun main() {
    println("Digite a largura da parede:")
    val largura = readln().toDouble()

    println("Digite a altura da parede:")
    val altura = readln().toDouble()

    val areaPintar = largura * altura

    val litroTinta = areaPintar / 2

    println("vai ser utilizado um total de $litroTinta Litros de tinta para pintar uma área de $areaPintar metros")
}