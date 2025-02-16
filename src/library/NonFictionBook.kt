package library

class nonFictionBook(title: String, author: String, isbn: Int, var subjectArea: String): Book(title, author, isbn){
    override fun displayInfo() = "${super.displayInfo()}, subjectArea: $subjectArea"
}