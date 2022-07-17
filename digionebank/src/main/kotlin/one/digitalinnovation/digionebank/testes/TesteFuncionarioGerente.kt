package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario.Companion.imprimeRelatorio

fun main(){
    val maria = Gerente(
        "Maria dos Santos",
        "987.654.321-01",
        3600.0, senha = "senha123" )

    imprimeRelatorio(maria)

    TesteAutenticacao().autentica(maria);
}

