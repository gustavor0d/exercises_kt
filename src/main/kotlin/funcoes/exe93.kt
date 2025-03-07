package funcoes

fun main() {
    println("Digite a primeira nota:")
    val nota1 = readln().toDoubleOrNull() ?: return println("Valor inválido")

    println("Digite a segunda nota:")
    val nota2 = readln().toDoubleOrNull() ?: return println("Valor inválido")

    println("A média das notas é: ${media(nota1, nota2)}")
}

fun media(valor1: Double, valor2: Double): Double = (valor1 + valor2) / 2