package library
open class Book(
    val title: String,
    val author: String,
    val isbn: String
) {
    open fun displayInfo() {
        println("Title: $title")
        println("Author: $author")
        println("ISBN: $isbn")
    }
}