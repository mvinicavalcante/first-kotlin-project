//nmrs divisíveis por 15 = FizzBuzz
//nmrs divisíveis por 3 = Fizz
//nmrs divisíveis por 5 = Buzz
//Caso contrário = imprime o número

fun fizzBuzz(numero: Int) = when {
    numero % 15 == 0 -> "FizzBuzz"
    numero % 3 == 0 -> "Fizz"
    numero % 5 == 0 -> "Buzz"
    else -> "$numero"
}

fun main() {
    for(numero in 1..100) {
        println(fizzBuzz(numero))
    }
}