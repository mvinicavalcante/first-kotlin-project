fun obterMnemonica(cor: Cor) =
    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }

fun obterTemperatura(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}

fun main() {

    val arr: IntArray = intArrayOf(0, 1, 2, 3, 4)

    for(i in arr.indices){
        println(arr[i])
    }

    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val temperatura = obterTemperatura(Cor.AMARELO)
    println(temperatura)
}