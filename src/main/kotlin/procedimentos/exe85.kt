package procedimentos

fun main() {
    gerador03("Aprendendo Portugol", 4)
}

fun gerador03(msg: String, qtd: Int = 1) {
    println("+      =============     +")
    for (i in 1..qtd) {
        println(msg)
    }
    println("+      =============     +")
}