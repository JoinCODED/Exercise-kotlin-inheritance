package Library

class NonFictionBook( title: String,author: String, ISBN: String, val fictionType: String) : Book(title, author, ISBN) {
    fun getFictionType() {
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Fiction Type: $fictionType")
    }
}
fun main() {
    val nonFictionBook = NonFictionBook("Atomic Habits", "James Clear", "9780735211292", "Self-Help")

    nonFictionBook.displayInfo()
    nonFictionBook.getFictionType()
}
