package Library
import java.time.LocalDate
open class Book(val title: String, val author: String, val ISBN: String, val publishYear: Int) {

    open fun displayInfo() {
        println("$title ($author) - $ISBN, Published in: $publishYear")
    }

    open fun read() {
        val datesRead = LocalDate.now()
        println("Read '$title' on: $datesRead")
    }
}
fun main() {
    val book = Book("Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin", "9780593321201", 2022)
    book.displayInfo()
    book.read()
}


