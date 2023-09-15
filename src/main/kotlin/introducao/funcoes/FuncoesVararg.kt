package introducao.funcoes

fun escrevaTudo(vararg mensagens: String){
    for (mensagem: String in mensagens) println(mensagem)
}

fun escrevaTudoComPrefixo(vararg mensagens: String, prefixo: String = "Info"){
    for (mensagem: String in mensagens) println(prefixo + mensagem)
}

fun log(vararg mensagens: String){
    escrevaTudo(*mensagens)
}
fun main(){
    escrevaTudo("I","Love","God")
    escrevaTudoComPrefixo("Love","Jesus","God", prefixo = "I See: ")
}