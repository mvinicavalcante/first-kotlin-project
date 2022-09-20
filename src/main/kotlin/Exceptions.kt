import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    try {
        val porcentagem = porcentagem(102)
        println(porcentagem)
    } catch (e: Exception){
        println(e.message)
    }

    val idade = lerIDade()
    println(idade)
}

fun porcentagem(numero: Int) : String {
    return if(numero in 1..100){
        "$numero%"
    }
    else{
        throw IllegalArgumentException("Numero nao esta no intervalo de 1 a 100")
    }
}

fun lerIDade() : Int? {
    val reader = FileReader(File("src/main/kotlin/idades.txt")) //(vai pegar o arquivo(O arquivo em si))
    val buffer = BufferedReader(reader) //Vai percorrer o arquivo selecionado

    try {
        val numero = buffer.readLine() //Pegar a primeira linha do arquivo
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close() //finally é a última ação. Ela é executada com Exception ou não no catch, dando certo ou errado
    }
}