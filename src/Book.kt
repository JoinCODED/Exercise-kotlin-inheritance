package library

open class Book(var title: String, var author: String, var iSBN: Int) {
    open fun printInfo(): String {
        return "$title By $author - ISBN: $iSBN"
    }
}