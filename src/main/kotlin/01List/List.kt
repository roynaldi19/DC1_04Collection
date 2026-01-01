package `01List`

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val stringList = listOf("Dicoding", "Indonesia", "Dico", "Coding")
    val anyList = listOf('a', "Kotlin", 3, true)

    println(numberList)
    println(charList)
    println(stringList)
    println(anyList)
    println(anyList[1])
}