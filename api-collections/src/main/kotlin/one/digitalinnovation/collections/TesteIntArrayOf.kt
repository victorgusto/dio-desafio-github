package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 12)

    values.forEach {
        println(it)
    }

    println("Valores ordernados")
    values.sort()
    values.forEach {
        println(it)
    }
}