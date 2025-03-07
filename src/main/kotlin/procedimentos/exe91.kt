package procedimentos

fun main() {
    println("Digite um valor inteiro:")
    val valor = readln().toIntOrNull() ?: return println("Valor inválido!")

    fibonacci(valor)
}

fun fibonacci(v: Int) {
    var a = 1
    var b = 1

    print("$a >> ")

    for (i in 1 until v) {
        var fibo = a + b
        print("$b >> ")
        a = b
        b = fibo
    }
    println("FIM")
}