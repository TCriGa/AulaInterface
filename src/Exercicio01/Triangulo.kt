package Exercicio01

class Triangulo(override var base: Double, override var altura: Double) : FormasGeometricas {
    override fun areaFormasGeometricas(): Double {
        println("A área do Retangulo de $base e $altura é = ")
        return (base * altura)/2
    }

    override fun dados() {
        super.dados()
    }
}