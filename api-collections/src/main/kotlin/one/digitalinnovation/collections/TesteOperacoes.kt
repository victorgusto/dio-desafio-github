package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2780.0, 6000.0)

    for (salario in salarios){
        println(salario)
    }

    println("\n----------------")
    println("Maior salario: ${salarios.maxByOrNull {it}}")
    println("Maior salario: ${salarios.maxOrNull() }")
    println("Menor salario: ${salarios.minByOrNull {it}}")
    println("Menor salario: ${salarios.minOrNull() }")
    println("Media salario: ${salarios.average()}}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("\n----------------")
    salariosMaiorQue2500.forEach{println(it)}

    println("\n----------------")
    println(salarios.count { it in 2500.0..5000.0 })

    println("\n----------------")
    println(salarios.find { it == 2780.0 })
    println(salarios.find { it == 500.0 })

    println("\n----------------")
    println(salarios.any { it == 2780.0 })
    println(salarios.any { it == 500.0 })



}