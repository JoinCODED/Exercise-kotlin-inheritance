package library

class NonFictionBook(title: String, author: String, ISBN: Int, val subjectArea: String) : Book(title, author, ISBN) {

    override fun displayInfo() {
        super.displayInfo()
        println("Subject: $subjectArea")
    }

    fun summary() = println("This book talks about $subjectArea.")

    fun isRecommended() = println("$title is highly recommended")
}

