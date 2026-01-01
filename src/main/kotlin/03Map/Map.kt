package `03Map`

fun main() {
    // Key: kode kelas, Value: Nama kelas
    val learningPathAndroid = mutableMapOf(
        80 to "Memulai Pemrograman dengan Kotlin",
        51 to "Belajar Membuat Aplikasi Android untuk Pemula",
        14 to "Belajar Fundamental Aplikasi Android",
    )

    for(kodeKelas in learningPathAndroid.keys) {
        println("Kode kelas: $kodeKelas - Nama kelas: ${learningPathAndroid[kodeKelas]}")
    }
}