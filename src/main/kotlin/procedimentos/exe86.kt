package procedimentos

fun main() {
    gerador04("Portugol Studio", 3, 2)
}

fun gerador04(msg: String, qtd: Int = 1, borda: Int = 0) {

    fun mensagem(x: String, y: Int = 1) {
        for (i in 1..qtd) {
            println(msg)
        }
    }

    when (borda) {
        1 -> {
            println("+-------=======------+")
            mensagem(msg, qtd)
            println("+-------=======------+")
        }
        2 -> {
            println("~~~~~~~~:::::::~~~~~~~")
            mensagem(msg, qtd)
            println("~~~~~~~~:::::::~~~~~~~")
        }
        3 -> {
            println("<<<<<<<<------->>>>>>>")
            mensagem(msg, qtd)
            println("<<<<<<<<------->>>>>>>")
        }
        else -> {
            println("+      =============     +")
            mensagem(msg, qtd)
            println("+      =============     +")
        }
    }
}