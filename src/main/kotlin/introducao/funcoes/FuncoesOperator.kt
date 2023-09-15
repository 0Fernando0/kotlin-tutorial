package introducao.funcoes

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(5 * "olá ")

    operator fun String.get(range: IntRange) = substring(range)
    println("Fernando" [3..5])
}