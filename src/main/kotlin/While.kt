import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    var temperatura : Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while(temperatura != 999) {
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
    }

    println("A média das temperaturas é = ${somatorio/quantidade}")

}