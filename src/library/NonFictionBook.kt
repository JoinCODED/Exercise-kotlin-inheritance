package library

import javax.security.auth.Subject

class NonFictionBook (title: String, authors: String, ISBN: Int, var subject: String ) :Book(title, authors, ISBN) {

    fun bookInfo() = "${displayInfo()} - $subject"

}