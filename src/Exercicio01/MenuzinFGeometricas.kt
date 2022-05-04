package Exercicio01

import kotlin.system.exitProcess

class MenuzinFGeometricas(override var base: Double, override var altura: Double) : FormasGeometricas {

    val retangulo: FormasGeometricas = Retangulo(base, altura)
    val quadrado: FormasGeometricas = Quadrado(base, altura)
    val triangulo: FormasGeometricas = Triangulo(base, altura)

    init {
        println("|------------------Bem Vindo ao Sistem de Calculo de áreas Geométricas------------------|")
    }

    fun opcaoMenu() {
        println("|---------------------- Digite a opção desejada: ---------------------------------------|")
        println("|---------------------- 01- Calcular Área Quadrado -------------------------------------|")
        println("|---------------------- 02- Calcular Área Retangulo ------------------------------------|")
        println("|---------------------- 03- Calcular Área Triangulo ------------------------------------|")
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
                else -> println("Opção inválida")
            }

        } while (true)
    }


    override fun areaFormasGeometricas(): Double {
        TODO("Not yet implemented")
    }
}