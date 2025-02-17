package Library

fun main() {
    val fictionBook = FictionBook("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "9780593321201", "Fiction")
    fictionBook.displayInfo()


    val nonFictionBook = NonFictionBook("Atomic Habits", "James Clear", "9780735211292", "Self-Help")

    nonFictionBook.displayInfo()
    nonFictionBook.getFictionType()
}
