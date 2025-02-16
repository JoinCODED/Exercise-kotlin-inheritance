package library

class FictionBook(title: String, author: String, ISBN: Int, var genre: String) : Book(title, author, ISBN) {
    override fun displayInfo() = "${super.displayInfo()}. the genre is ${genre}"
}

