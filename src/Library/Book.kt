package Library

open class Book(var title: String, var author: String, var isbn: String){

    open fun displayInfo(){

        println("$title by $author - ISBN: $isbn")

    }
}