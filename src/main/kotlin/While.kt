import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    var temperatura : Int
    var somatorio: Int = 0
    var quantidade: Int = 0

    do{
        try{
            println("Digite uma temperatura ou 999 para sair: ")
            temperatura = readLine()!!.toInt()

            if(temperatura != 999) {
                somatorio +=temperatura
                quantidade++
            }
        }
        catch(exception: Exception) {
            throw IllegalArgumentException("Você não digitou um inteiro!")
        }

    } while (temperatura != 999)

    println("A média das temperaturas é = ${somatorio/quantidade}")

}