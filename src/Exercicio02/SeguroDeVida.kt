package Exercicio02

class SeguroDeVida(override var saldo: Double) : Tributos {
    override fun calcularTributos(): Double {
        saldo -= 42.0 - saldo
        println("O valor do saldo do seguro de vida ap�s a incidencia de tributa��o de R$ 42,00 � = $saldo")
        return saldo
    }
}