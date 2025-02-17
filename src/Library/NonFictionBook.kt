package Library

class NonFictionBook(title: String, author: String, ISBN: Int, val subject: String): Book(title, author, ISBN ) {
    override fun displayInfo() =
        "${super.displayInfo()}, subject: $subject"


    fun whatsTheSubject () = "subject: $subject"

}