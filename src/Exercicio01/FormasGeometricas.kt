package Exercicio01

interface FormasGeometricas {
    var base :Double
    var altura :Double
    fun areaFormasGeometricas(): Double

   open fun dados() {

        println("Informe o valor da base: ")
        base = readln().toDouble()
        println("Informe o valor da altura:")
        altura = readln().toDouble()
    }
}