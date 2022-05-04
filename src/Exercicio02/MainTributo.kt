package Exercicio02

fun main() {
    val contaCorrente : Tributos = ContaCorrente(1000.0)
    val seguroDeVida : Tributos = SeguroDeVida(500000.0)
    val contaPoupanca = ContaPoupanca()

    contaPoupanca.valorTributacao(2000.0)
    seguroDeVida.calcularTributos()
    contaCorrente.calcularTributos()
}