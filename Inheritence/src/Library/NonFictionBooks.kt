package Library

class NonFictionBook(
    title: String, author: String, ISBN: String, val fictionType: String, publishYear: Int
) : Book(title, author, ISBN, publishYear) {

    override fun displayInfo() {
        super.displayInfo()
        println("Fiction Type: $fictionType")
    }
}

fun main() {
    val fictionBook =
        FictionBook("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "9780593321201", "Fiction", 2022)
    fictionBook.displayInfo()
    fictionBook.read()

    val nonFictionBook = NonFictionBook("Atomic Habits", "James Clear", "9780735211292", "Self-Help", 2018)
    nonFictionBook.displayInfo()
    nonFictionBook.read()
}