package exercises

fun main() {
    println("Digite a primeira nota:")
    val nota01 = readln()!!.toDouble()

    println("Digite a segunda nota:")
    val nota02 = readln()!!.toDouble()

    val media = (nota01 + nota02) / 2

    println("A média entre $nota01 e $nota02 é igual a $media")
}