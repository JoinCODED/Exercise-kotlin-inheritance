package library

class NonFictionBook(title: String, author: String, ISBN: String, val subjectArea: String) : Book(title, author, ISBN) {

    override fun displayInfo() {
        super.displayInfo()
        println("Subject Area: $subjectArea")
    }

    fun similarBooks() {
        println("If you love '$title' , you might also enjoy other $subjectArea books.")
    }
}
