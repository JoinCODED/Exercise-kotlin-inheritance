package library

open class Book(var title: String, var author: String, var ISBN: Int) {
    open fun displayInfo() {
        println("$title by $author Book Number: $ISBN")
    }
}