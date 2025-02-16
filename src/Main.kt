import library.FitctionBook
import library.NonFictionBook

fun main() {

    val fitctionBook = FitctionBook("moon", "peter", 2002, "fiction")
    val nonFictionBook = NonFictionBook("stone", "jack", 2003, "nonfiction")

    println(fitctionBook.bookInfo())
    println(nonFictionBook.bookInfo())
}