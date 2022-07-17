package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    for (i in values.indices){
        values[i] = (1..30).random()
    }

    for (valor in values){
        println(valor)
    }
    println("==========================")
    values.forEach {valor ->
        println(valor)
    }
    println("==========================")
    for(index in values.indices){
        println(values[index])
    }

    println("==========================")
    values.sort()
    for(index in values.indices){
        println(values[index])
    }

}