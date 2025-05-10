package library

class FictionBook(title:String , author:String , ISBN:Int , var genre: String): Book(title, author,ISBN)
{
    fun choiceOfBook() = "This is your choice of fiction book:"
    override fun displayInfo() = "${super.displayInfo()} Book Genre: $genre"

}