package library

class FictionBook(title: String, author: String, isbn: Int, val genre: String, val hasMovieAdaptation: Boolean):
    Book(title, author, isbn){
        override fun displayInfo() = "${super.displayInfo()}, Genre: ${genre}, Adapted to a movie: ${hasMovieAdaptation}";
}