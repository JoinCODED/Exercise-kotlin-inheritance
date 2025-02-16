package library

class FictionBook(
    title:String, author:String, ISBN:Int,
    val genre:String,
) :Book(title, author, ISBN){

    override fun displayInfo(): String {
        return "${super.displayInfo()}, Genre:$genre"
    }

    override fun ratings() {
        println("Testing forcing to create this method ratings() :P");
    }
}