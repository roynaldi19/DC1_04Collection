package `04CollectionsOperations`

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan5 = numberList.first { it > 5 }
    val moreThan6 = numberList.last { it > 6 }

    println(moreThan5)
    println(moreThan6)
}