package Library

open class Book(val title: String,val author: String, val isbn: Int ){
    open fun displayInfo(){
        println("Title:$title")
        println("Author: $author")
        println("ISBN: $isbn")
    }
    fun main(){
        val book = Book("The Outsiders","S.E.Hinton",64673497 )
        book.displayInfo()
    }
}

