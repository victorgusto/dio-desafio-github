package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario.Companion.imprimeRelatorio

fun main(){
    val joao = Analista("Joao Silva", "987.654.321-01", 2000.0 )
    imprimeRelatorio(joao)
}