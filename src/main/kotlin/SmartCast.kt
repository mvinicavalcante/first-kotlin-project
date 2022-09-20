import java.lang.IllegalArgumentException

interface Expressao

class Numero(val valor: Int) : Expressao

class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

fun avaliacao(expressao: Expressao) : Int =
    when(expressao) {
        //adicionando um bloco em is Numero
        is Numero -> {
            //adicionei o bloco e o programa entende que a última linha do bloco é o return necessário
            println("Valor do número: ${expressao.valor}")
            //return implícito
            expressao.valor
        }
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressão é desconhecida")
    }
fun main() {
    // ((1 + 2) + 4) = 7
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}