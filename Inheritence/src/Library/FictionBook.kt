package Library

class FictionBook(
    title: String, author: String, ISBN: String, val genre: String) : Book(title, author, ISBN) {

    fun getGenre() {
        println("Genre: $genre")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Genre: $genre")
    }
}
fun main() {
    val fictionBook = FictionBook("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "1234567890", "Fiction")

    fictionBook.displayInfo()
    fictionBook.getGenre()
}

