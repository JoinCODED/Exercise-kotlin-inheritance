package Library

class FictionBook(title: String, author: String, iSBN: Int, val genre: String):
    Book (title, author, iSBN) {

    fun getGenre(){
        println("The genre is: $genre")
    }
}