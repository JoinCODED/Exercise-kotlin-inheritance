package library

class NonFictionBook(
    title:String, author:String, ISBN:Int,
    val subjectArea:String,
) :Book(title, author, ISBN) {

    override fun displayInfo(): String {
        return "${super.displayInfo()}, Subject Area:$subjectArea"
    }

    override fun ratings() {
        println("Testing forcing to create this method ratings() :P");
    }
}