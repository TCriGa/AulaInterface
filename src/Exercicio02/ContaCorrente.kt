package Exercicio02

class ContaCorrente(override var saldo: Double) : Tributos{
    override fun calcularTributos(): Double {
        saldo -= (0.01 * saldo)
        println("O valor do saldo da sua conta corrente ap�s a incidencia de tributa��o de 1% � = $saldo")
        return saldo
    }
}