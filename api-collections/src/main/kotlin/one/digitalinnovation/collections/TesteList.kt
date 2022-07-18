package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3600.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 5000.0, "CLT")

    val funciarios = listOf(joao, pedro, maria)

    funciarios.forEach{ println(it)}

    println("------------------")
    println(funciarios.find{ it.nome == "Maria"})

    println("------------------")
    funciarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("------------------")
    funciarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}

}

