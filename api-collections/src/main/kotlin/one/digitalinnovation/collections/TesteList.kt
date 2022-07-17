package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 5000.0)

    val funciarios = listOf(joao, pedro, maria)

    funciarios.forEach{ println(it)}

    println("------------------")
    println(funciarios.find{ it.nome == "Maria"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()

}