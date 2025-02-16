package library

class FitctionBook (title: String, authors: String, ISBN: Int, var genre: String ) :Book(title, authors, ISBN) {

    fun bookInfo() = "${displayInfo()} - $genre"

}