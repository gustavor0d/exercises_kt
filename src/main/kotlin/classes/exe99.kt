package classes

fun main() {
    val conta = ContaBancaria(saldo = 5000.0)

    conta.depositar(500.0)

    println("Saldo em conta: ${conta.saldo}")

    conta.sacar(6000.0)

    conta.sacar(5500.0)
}

class ContaBancaria(
    var saldo: Double,
) {
    fun depositar(valor: Double) {
        saldo += valor
        println("Deposito no valor de R$$valor realizado. Novo saldo: R$$saldo")
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque no valor de R$$valor realizado. Novo saldo: R$$saldo")
        } else
            println("Você não pode sacar R$$valor pelo motivo de: Saldo insuficiente.")
    }
}