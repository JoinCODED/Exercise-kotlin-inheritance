package library

open class Book(var title: String, var author: String, var ISBN: Int) {
   open fun displayInfo() = "$author wrote $title and he is happy about it. The ISB is $ISBN"
}