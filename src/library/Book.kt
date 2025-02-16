package library

open class Book {
    var title = ""
    var author = ""
    var yearPublished = 0

    fun displayInfo(){
        println("Title: $title")
        println("By: $author")
        println("Published in: $yearPublished \n")
    }

}


fun main(){
    val ficBook = FictionBook()
    ficBook.fictionGenre(genre = "Fantasy")
}