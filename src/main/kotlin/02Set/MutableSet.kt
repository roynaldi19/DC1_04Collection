package `02Set`

fun main() {
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    println(mutableSet)
}