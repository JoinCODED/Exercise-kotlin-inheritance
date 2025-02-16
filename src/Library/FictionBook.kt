package library

open class FictionBook ( title: String, author: String, price: Int,
var catogery: String ):  Book ( title, author, price) {

   override fun displayInfo()= "${super.displayInfo()}, $catogery"
}