package Library

class FictionBook(
    title: String, author: String, ISBN: String, val genre: String, publishYear: Int
) : Book(title, author, ISBN, publishYear) {

    override fun displayInfo() {
        super.displayInfo()
        println("Genre: $genre")
    }
}
fun main() {
    val fictionBook = FictionBook("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "9780593321201", "Fiction", 2022)
    fictionBook.displayInfo()
    fictionBook.read() }