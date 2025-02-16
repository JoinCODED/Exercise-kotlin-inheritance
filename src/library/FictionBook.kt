package library

class FictionBook(title: String, author: String, ISBN: Int, var genre: String): Book(title, author, ISBN) {
    override fun displayInfo() {
        println("I overrided the display function that we had in our main class that we inherited from ")
    }
    fun printBookGenre() {
        println("The Book Genre is $genre")
    }
}