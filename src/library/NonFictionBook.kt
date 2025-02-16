package library

class NonFictionBook(title: String, author: String, ISBN: Int, val subject: String, ) :
    Book(title, author, ISBN){
    fun nonFiction() = "\nThis is a non fiction book in $subject"

    fun displayNonfictionInfo() = "${displayInfo()}, subject: $subject"
}