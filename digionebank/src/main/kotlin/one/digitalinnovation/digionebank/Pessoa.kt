package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Victor"
    var cpf : String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val victor = Pessoa()
    println(victor.pessoaInfo())
}