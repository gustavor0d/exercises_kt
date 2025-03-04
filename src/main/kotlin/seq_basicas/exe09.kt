package seq_basicas

fun main() {
    println("Quanto dinheiro você tem na cateira:")
    val seuDinheiro = readln().toDouble()
    val cotacaoDollar = 3.45
    val conversao = seuDinheiro / cotacaoDollar

    println("Você tem U$${"%.2f".format(conversao)} Dolares com R$${"%.2f".format(seuDinheiro)} Reais")
    }