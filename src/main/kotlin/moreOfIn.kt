fun main() {
    println(isLetter('a'))
    println(isNotDigit('x'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z' //return true or false

fun isNotDigit(c: Char) = c !in '0'..'9'