package Library
open class Book(val title: String, val author: String, val ISBN: String) {

    open fun displayInfo() {
        println("$title ($author) - $ISBN ")
    }
}

fun main() {
    val book = Book("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "1234567890")
    book.displayInfo()
}