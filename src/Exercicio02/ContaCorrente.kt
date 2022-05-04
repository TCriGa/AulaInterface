package Exercicio02

class ContaCorrente(override var saldo: Double) : Tributos{
    override fun calcularTributos(): Double {
        saldo -= (0.01 * saldo)
        println("O valor do saldo da sua conta corrente após a incidencia de tributação de 1% é = $saldo")
        return saldo
    }
}