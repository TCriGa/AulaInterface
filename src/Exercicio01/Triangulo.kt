package Exercicio01

class Triangulo(override var base: Double, override var altura: Double) : FormasGeometricas {
    override fun areaFormasGeometricas(): Double {
        println("A �rea do Retangulo de $base e $altura � = ")
        return (base * altura)/2
    }

    override fun dados() {
        super.dados()
    }
}