package library

open class Book ( var title : String, var author: String, var price: Int) {
   open fun displayInfo()= " title : $title , name:  $author, price: $price "
override fun toString()= displayInfo()
}
