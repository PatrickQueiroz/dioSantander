package one.digitalinnovation.testes

import one.digitalinnovation.Funcionario
import one.digitalinnovation.Pessoa
import java.math.BigDecimal

fun main() {
    val patrick = Pessoa(nome = "Patrick", cpf = "1231231232")
    println(patrick.nome)
    println(patrick.cpf)

    val mor = Funcionario("Ruhama", "12345678", BigDecimal.valueOf(2000.0))
    println(mor.nome)
    println(mor.cpf)
}