package library

class FictionBook(
    title: String,
    author: String,
    ISBN: String,
    var imagePath: String,
    var genre: String = "fantasy",
): Book(title, author, ISBN) {

     override fun getInfo(): String{
        return "$genre - ${super.getInfo()}"
    }

    fun getImageURL(): String {
        return "https://yousite.com/$imagePath";
    }
}