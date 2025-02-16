package library

open class Book(val title: String, val author: String, val ISBN: Int){

    fun displayInfo() = "$title by $author, ISBN: $ISBN"
}
