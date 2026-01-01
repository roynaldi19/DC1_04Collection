package `04CollectionsOperations`

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList.lastOrNull { it % 2 == 1 }

    println(firstOddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)


}