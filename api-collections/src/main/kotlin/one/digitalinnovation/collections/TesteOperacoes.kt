package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2780.0, 6000.0)

    for (salario in salarios){
        println(salario)
    }

    println("\n----------------")
    println("Maior salario: ${salarios.maxByOrNull {it}}")
    println("Menor salario: ${salarios.minByOrNull {it}}")
    println("Media salario: ${salarios.average()}}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("\n----------------")
    salariosMaiorQue2500.forEach{println(it)}

}