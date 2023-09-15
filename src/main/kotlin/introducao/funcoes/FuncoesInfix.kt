package introducao.funcoes


fun main() {
    infix fun Int.repetir(str: String) = str.repeat(this)
    println(3 repetir "ola")

    val pair: Pair<String,String> = "carro" to "garagem"
    println(pair)

    infix fun String.onto(other: String) = Pair(this,other)
    val mypair = "moto" onto "mecanico"

    val carlos = Pessoa("carlos")
    val gustavo = Pessoa("gustavo")

    carlos like gustavo
}

class Pessoa(val nome: String){
    val pessoasFavoritas = mutableListOf<Pessoa>()
    infix fun like(other: Pessoa) = pessoasFavoritas.add(other)
}