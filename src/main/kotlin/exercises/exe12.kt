package exercises

fun main() {
    println("Digite o preço do produto:")
    val precoProduto = readln().toDouble()

    val precoPromocional = precoProduto * 0.95

    println("Valor do produto com 5% de desconto: R$${"%.2f".format(precoPromocional)}")
}