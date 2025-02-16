package library

open class Book(var title: String, var author: String, var isbn: Int) {
    fun displayInfo(){
        println("Title: $title, Author: $author, isbn: $isbn")
    }

}