package library

abstract class Book(val title:String, val author:String, val ISBN:Int) {


    open fun displayInfo() = "Title: $title, Author:$author, ISBN:$ISBN";

    abstract fun ratings()
}