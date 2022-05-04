package Exercicio01

class Quadrado(override var base: Double, override var altura: Double) : FormasGeometricas {
    override fun areaFormasGeometricas(): Double {
        println("A área do Quadrado de lado $base e $altura é =")
        return base * altura
    }

    override fun dados() {
        super.dados()
    }
}