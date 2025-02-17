package Library

class FictionBook(title:String, author:String, ISBN: Int, val genre: String , val pages: Int , val userType: String): Book(title, author, ISBN) {
    override fun displayInfo() = "${super.displayInfo()}, genre: $genre"

    fun numberOfpages(): String {
        return if (userType == "admin") {
            "number of pages: $pages"
        } else {
            return "You are not an admin";
        }
    }
}