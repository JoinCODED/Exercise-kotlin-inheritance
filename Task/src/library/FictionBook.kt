package library

class FictionBook(title: String, author: String, ISBN: Int, var genre: String):
    Book(title, author, ISBN) {
    fun reading() = "I am Reading a book called"
        override fun displayInfo() = "${super.displayInfo()} and its type is $genre"

}
