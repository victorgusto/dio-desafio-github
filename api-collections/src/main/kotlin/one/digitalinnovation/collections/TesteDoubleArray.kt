package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 963.0
    salarios[2] = 369.0

    salarios.forEach { println(it) }


    println("\n----------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("\n----------------")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()

    salarios2.forEach { println(it) }

}