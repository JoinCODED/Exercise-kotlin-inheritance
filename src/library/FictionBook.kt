package library

class FictionBook(title: String, author: String, isbn: String, var genre: String) : Book(title, author, isbn) {

    fun FictionInfo() = info() + "| Genre: $genre"

    override fun read(){
        println("Im reading fiction! by $author ")
    }
    fun displayFictionInfo() = println(FictionInfo())

    override fun toString(): String {
        return "FictionBook(genre='$genre') ${super.toString()}"
    }


}
