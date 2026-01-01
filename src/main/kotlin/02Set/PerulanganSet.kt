package `02Set`

fun main() {
    val mutableSet = setOf(5, 10, 1, 7, 8, 5)

    for(number in 1..5) {
        if (number in mutableSet) {
            println(number)
        }
    }
}