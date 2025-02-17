package Library

class FictionBook(
    title: String, author: String, ISBN: String, val genre: String) : Book(title, author, ISBN) {


    override fun displayInfo() {
        super.displayInfo()
        println("Genre: $genre")
    }
}
fun main() {
    val fictionBook = FictionBook("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "9780593321201 ", "Fiction")

    fictionBook.displayInfo()
}

