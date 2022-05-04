package Exercicio01

import kotlin.system.exitProcess

class MenuzinFGeometricas(override var base: Double, override var altura: Double) : FormasGeometricas {

    val retangulo: FormasGeometricas = Retangulo(base, altura)
    val quadrado: FormasGeometricas = Quadrado(base, altura)
    val triangulo: FormasGeometricas = Triangulo(base, altura)

    init {
        println("|------------------Bem Vindo ao Sistem de Calculo de �reas Geom�tricas------------------|")
    }

    fun opcaoMenu() {
        println("|---------------------- Digite a op��o desejada: ---------------------------------------|")
        println("|---------------------- 01- Calcular �rea Quadrado -------------------------------------|")
        println("|---------------------- 02- Calcular �rea Retangulo ------------------------------------|")
        println("|---------------------- 03- Calcular �rea Triangulo ------------------------------------|")
        println("|---------------------- 04- Sair -------------------------------------------------------|")
    }

    fun inserirMenu() {

        do {
            opcaoMenu()
            when (readln().toInt()) {
                1 -> {
                    quadrado.dados()
                   println("${quadrado.areaFormasGeometricas()}")
                }
                2 -> {
                    retangulo.dados()
                   println("${ retangulo.areaFormasGeometricas()}")
                }
                3 ->{
                    triangulo.dados()
                    println("${triangulo.areaFormasGeometricas()}")
                }

                4 -> {
                    println("Obrigada por utilizar nosso sistema!!! :)")
                    exitProcess(0)
                }
                else -> println("Op��o inv�lida")
            }

        } while (true)
    }


    override fun areaFormasGeometricas(): Double {
        TODO("Not yet implemented")
    }
}