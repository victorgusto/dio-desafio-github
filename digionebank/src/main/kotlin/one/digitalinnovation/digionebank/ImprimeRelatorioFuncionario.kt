package one.digitalinnovation.digionebank

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprimeRelatorio(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}