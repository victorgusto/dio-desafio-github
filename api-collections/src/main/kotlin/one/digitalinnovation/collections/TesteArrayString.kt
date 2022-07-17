package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "XP"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    println("\nArray ordenado")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("\nOutro método de declaração.")
    val arrayDeNomes = arrayOf("Victor", "Camila", "Maria")
    arrayDeNomes.forEach {
        println(it)
    }
}