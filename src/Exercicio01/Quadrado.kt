package Exercicio01

class Quadrado(override var base: Double, override var altura: Double) : FormasGeometricas {
    override fun areaFormasGeometricas(): Double {
        println("A �rea do Quadrado de lado $base e $altura � =")
        return base * altura
    }

    override fun dados() {
        super.dados()
    }
}