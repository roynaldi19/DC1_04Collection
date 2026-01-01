package `02Set`

fun main() {
    //set hanya di isi angka unik atau berbeda
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(setA == setB)
    println(5 in setA)

    println(union)
    println(intersect)
}