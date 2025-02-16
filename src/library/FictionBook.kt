package library

class fictionBook(title: String, author: String, isbn: Int, var genre: String): Book(title, author, isbn){
    override fun displayInfo() = "${super.displayInfo()}, genre: $genre"
}