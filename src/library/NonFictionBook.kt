package library

class NonFictionBook(title:String , author: String, isbn: Int, var subject: String): Book ( title , author, isbn) {

    fun getInfoNonFictionBook(){
        println("Book Info: Title: $title, Author: $author, isbn: $isbn , Subject: $subject")
    }
}