package `04CollectionsOperations`

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val bisaDibagiDua = numberList.filter { it % 2 == 0 }
    println(bisaDibagiDua)

    val tidakBisaDibagiDua = numberList.filterNot { it % 2 == 0 }
    println(tidakBisaDibagiDua)
}