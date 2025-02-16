package library

open class Book (var title: String, var author: String, var isbn: Int){
    open fun displayInfo() = "$title by $author, ISBN: $isbn"
    override fun toString() = displayInfo()
}
