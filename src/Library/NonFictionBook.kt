package Library

// NonFictionBook class inherits from Book and adds the subject area attribute
class NonFictionBook(
    title: String,
    author: String,
    isbn: String,
    val subjectArea: String,
    val summary: String,
) : Book(title, author, isbn) {

    // Overriding displayInfo() to include subject area and other relevant info
    override fun displayInfo() {
        super.displayInfo() // Call the parent class method
        println("Subject Area: $subjectArea")

    }

    fun displayNonFictionDetails() {
        println("$title is a non-fiction book on $summary and it is a $subjectArea book.")
    }

    fun getSummry(): String {
        return "Summary: $summary"
    }
}
