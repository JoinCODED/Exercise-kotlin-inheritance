package library

class NonFictionBook(title: String, author: String, isbn: String, var subjectArea: String) : Book(title, author, isbn){

    fun NonFictionInfo() = info() + "| Subject Area: $subjectArea"

    fun displayNonFictionInfo() = println(NonFictionInfo())

    override fun read(){
        println("Im reading non-fiction! by $author ")}

    override fun toString(): String {
        return "NonFictionBook(subjectArea='$subjectArea') ${super.toString()}"
    }


}
