package one.digitalinnovation.testes

import one.digitalinnovation.Funcionario

class imprimeRelatorioFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )

        }
    }
}