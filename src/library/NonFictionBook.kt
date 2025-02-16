package library

class NonFictionBook(title:String,author:String,ISBN:Int,var subject:String) : Book(title,author,ISBN) {
    override fun displayInfo() = "${super.displayInfo()}. the subject is ${subject}"
}
