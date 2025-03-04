package seq_basicas

fun main() {
    println("Dias trabalhados no mês:")
    val diasTrab = readln().toIntOrNull() ?: 0

    val salario: Double = (diasTrab * 8) * 25.0

    println("Com base em trabalhar 8 horas por dia e receber 25 reais por hora, no mês você ganha: R$%.2f.".format(salario))
}