package introducao.funcoes

fun escrevaMensagem(mensagem: String): Unit
{
    println(mensagem)
}

fun escrevaMensagemComPrefixo(mensagem: String, prefixo: String = "Info"){
    println("[$prefixo] $mensagem")
}

fun somar(x: Int, y: Int): Int
{
    return x + y
}

fun multiplicar(x: Int, y: Int) = x * y

fun main() {
    escrevaMensagem("olá")
    escrevaMensagemComPrefixo("olá","log")
    escrevaMensagemComPrefixo("olá")
    escrevaMensagemComPrefixo(prefixo =  "log", mensagem = "olá")
    println(somar(1,2))
    println(multiplicar(2,2))
}