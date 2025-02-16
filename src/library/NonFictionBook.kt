package library

class NonFictionBook(title: String, author: String, ISBN: Int, var subject: String): Book(title, author, ISBN) {
    fun printBookSubject() {
        println("the book subject is $subject")
    }
}