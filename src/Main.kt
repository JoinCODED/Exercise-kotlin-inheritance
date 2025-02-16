import library.Book
import library.FictionBook


fun main() {
    val newBook = Book("test", "yousef", "1234")
    newBook.displayInfo()

    val fictionBook = FictionBook(
        "zombies",
        "max brookes",
        "1234",
        "Fanatasy",
        "1234-zombies.jpg"
    );
    fictionBook.displayInfo()


}