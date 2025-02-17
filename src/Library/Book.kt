package Library

open class Book(val title:String, val author:String, val ISBN: Int) {
    open fun displayInfo() =  "title: $title, author: $author, ISBN: $ISBN "
}