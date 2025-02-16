package library
class NonFictionBook(title: String,
                     author: String,
                     isbn: String,
                     val subject: String):
    Book(title, author, isbn){
    override fun displayInfo() {
        super.displayInfo()
        println("Subject: $subject")
    }
    fun funFact(){
        println("Did you know? " +
                "$title gives amazing " +
                "insights into $subject?")
    }
}
