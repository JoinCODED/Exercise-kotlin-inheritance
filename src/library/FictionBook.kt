package library

class FictionBook(title: String, author: String, ISBN: Int, val genre: String) :
    Book(title, author, ISBN){
    fun fiction() = "\nThis is a fiction book in :$genre"
    fun displayFictionInfo() = "${displayInfo()}, genre: $genre"
}