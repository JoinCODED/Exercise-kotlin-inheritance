package library

open class Book(var title: String, var author: String, var ISBN: Int){
    open fun displayInfo() = "Title: $title by $author ISBN: $ISBN"
    override fun toString() = displayInfo()
}