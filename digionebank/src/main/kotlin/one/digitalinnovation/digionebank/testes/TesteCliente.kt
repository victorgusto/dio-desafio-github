package one.digitalinnovation.digionebank.testes

import com.sun.tools.javac.Main
import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose Antonio de Jandiru",
        cpf = "123.654-789-90",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}
