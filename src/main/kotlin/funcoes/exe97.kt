package funcoes

fun main() {
    println("Digite a primeira nota:")
    val nota1 = readln().toDoubleOrNull() ?: return println("Valor inválido")

    println("Digite a segunda nota:")
    val nota2 = readln().toDoubleOrNull() ?: return println("Valor inválido")

    val media = media02(nota1, nota2)

    println("A média das notas é: $media e a situação é: ${situacao(media)}")
}

fun media02(valor1: Double, valor2: Double): Double = (valor1 + valor2) / 2

fun situacao(media: Double): String {
    if (media in 7.0..10.0) return "APROVADO"
    else if (media in 3.0..6.99) return "RECUPERAÇÃO"
    else return "REPROVADO"
}