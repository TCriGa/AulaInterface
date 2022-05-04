package Exercicio02

class SeguroDeVida(override var saldo: Double) : Tributos {
    override fun calcularTributos(): Double {
        saldo -= 42.0 - saldo
        println("O valor do saldo do seguro de vida após a incidencia de tributação de R$ 42,00 é = $saldo")
        return saldo
    }
}