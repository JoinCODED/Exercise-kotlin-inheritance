import library.FictionBook
import library.NonFictionBook

fun main() {

    val fictionBook = FictionBook("The Hobbit", "John Ronald Tolkien", 123, "Fantasy")
    val nonFictionBook = NonFictionBook("A Brief History of Time", "Stephen Hawking", 456, "Science")

    println("Fiction Book Details:")
    fictionBook.displayInfo()
    fictionBook.recommend()
    fictionBook.isBestSeller()

    println("Non-Fiction Book Details:")
    nonFictionBook.displayInfo()
    nonFictionBook.summary()
    nonFictionBook.isRecommended()
}
