fun main() {
    /* ################################## */
    /* COMO CRIAR COLEÇÕES */

    /* ArrayList - Classe */
    val frutas1 = ArrayList<String>()
    frutas1.add("Maçã")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    /* ArrayList - Função */
    val frutas2 = arrayListOf("Maçã", "Banana", "Morango")

    /* Estruturas de dados */

    println(frutas2.last())

    val numeros = setOf(1, 14, 2)
    println(numeros.max())
}