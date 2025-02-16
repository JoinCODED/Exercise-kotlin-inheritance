package library

class NonFictionBook(
    title: String,
    author: String,
    ISBN: String,
    var imagePath: String,
    var subject: String = "History",
    var genre: String = "Non-fiction",
): Book(title, author, ISBN) {

    override fun getInfo(): String{
        return "$genre - A $subject book titled: ${super.getInfo()}"
    }

    fun pullCitation(): String {
        return "$ISBN ISBN, $title, $author"
    }

    fun getImageURL(): String {
        return "https://yousite.com/$imagePath";
    }
}