package `01List`

fun main() {
    val nameList = listOf("Dicoding", "Indonesia", "Dico", "Coding")

    for(name in nameList) {
        println(name)
    }

    for (name in nameList) {
        if (name == "Dicoding") {
            println("HappyCoding")
            break
        }
    }
}