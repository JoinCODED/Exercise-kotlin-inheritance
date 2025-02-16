import library.Book
import library.FictionBook
import library.NonFictionBook

fun main() {
    val newBook = Book("test", "yousef", "1234")
    newBook.displayInfo()

    val fictionBook = FictionBook(
        "zombies",
        "max brookes",
        "1234",
        "1234-zombies.jpg"
    );
    fictionBook.displayInfo()

    val nonFictionBook = NonFictionBook(
        "clean code",
        "some dude",
        "010101",
        "010101-clean-code.jpg",
        subject="Programming"
    );
    nonFictionBook.displayInfo()
}