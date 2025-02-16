package library

class FictionBook( title: String, author:String, isbn:Int,  var genre: String): Book ( title , author, isbn){
    fun getInfoFiction(){
        println("Book Info: Title: $title, Author: $author, isbn: $isbn , Genre: $genre")

    }

    fun bookSeries(){
        println("Lord Of The Rings")
    }
}