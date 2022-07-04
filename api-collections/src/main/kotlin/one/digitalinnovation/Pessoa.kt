package one.digitalinnovation

class Pessoa {
    var nome: String = "Patrick"
    var cpf: String = "123.123.123.12"
    private set
    constructor()
    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val patrick = Pessoa()
    println(patrick.pessoaInfo());

}