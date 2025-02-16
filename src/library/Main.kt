package library

fun main() {
    var fictionBook = FictionBook("A Fiction Book", "some one", 198374, "fantasy")
    var nonFictionBook = NonFictionBook("A Non Fiction Book", "some one", 198374, "science")

    fictionBook.printBookGenre()
    nonFictionBook.printBookSubject()
    nonFictionBook.displayInfo()
    fictionBook.displayInfo()
}