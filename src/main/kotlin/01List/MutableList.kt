package `01List`

fun main() {
    val anyList = mutableListOf('a', "Kotlin", 3, true)
    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array

    println(anyList)
    println(anyList[1])
}