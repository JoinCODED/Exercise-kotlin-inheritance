import  library.*
fun main() {


    val myBook = FictionBook(
        title = "The Time Traveler's Adventure",
        author = "Alice Roberts",
        ISBN = 123456789,
        genre = "Science Fiction"
    );

    val myNonFictionBook = NonFictionBook(
        title = "Sapiens: A Brief History of Humankind",
        author = "Yuval Noah Harari",
        ISBN = 978006231,
        subjectArea = "History"
    )


    println(myBook.displayInfo())
    println(myNonFictionBook.displayInfo())

    // the difference when creating an abstract class
    // is that you cant create an instance of this type
    myBook.ratings()
    myNonFictionBook.ratings()

}