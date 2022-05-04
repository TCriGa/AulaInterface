package Exercicio01

class Retangulo(override var base: Double, override var altura: Double) : FormasGeometricas {
    override fun areaFormasGeometricas(): Double {
        println("A área do Retangulo de $base e $altura é = ")
        return base * altura
    }

    override fun dados() {
        super.dados()
    }
}