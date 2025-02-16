package library

open class Book(val title: String, val author: String, val isbn: Int) {
    open fun displayInfo() = "title: ${title}, author: ${author}, ISBN: ${isbn}";

}