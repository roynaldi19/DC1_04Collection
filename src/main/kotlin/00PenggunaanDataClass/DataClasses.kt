package `00PenggunaanDataClass`

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("Roy", 29)
    val dataUser = DataUser("Roy", 29)
    val dataUser2 = DataUser("Roy", 29)
    val dataUser3 = DataUser("dimas", 24)

    println(user)
    println(dataUser)

    println(dataUser == dataUser2)
    println(dataUser == dataUser3)

}