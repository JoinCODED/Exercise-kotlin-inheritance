package Library

class NonFictionBook(title: String, author: String, iSBN: Int, val subject: String ):
    Book (title, author, iSBN){

    fun getSubject(){
        println("The subject is: $subject")
    }
}