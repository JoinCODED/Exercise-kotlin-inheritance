package Library

fun main() {
    val fictionBook = FictionBook(
        title = "Kokoro",
        author = "Natsume Soseki",
        isbn = "978-0895267153",
        genre = "Fiction",
        summary =
        " story that follows a young university student and his strange friendship with a much older man whom he calls 'Sensei' which is a common Japanese term to address elders, especially teachers"
    )

    // Test the FictionBook methods
    println("Fiction Book Info:")
    fictionBook.displayInfo()
    fictionBook.displayFictionDetails()
    println()

    // Create an instance of NonFictionBook
    val nonFictionBook = NonFictionBook(
        title = "A Brief History of Time",
        author = "Stephen Hawking",
        isbn = "978-0553380163",
        subjectArea = "Science",
        summary = "A landmark book by Stephen Hawking that explores the mysteries of the universe, including the nature of time, black holes, and the Big Bang."
    )
    // Test the NonFictionBook methods
    println("Non-Fiction Book Info:")
    nonFictionBook.displayInfo()
    println(nonFictionBook.getSummry())
    nonFictionBook.displayNonFictionDetails()
}
