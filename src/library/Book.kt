package library

open class Book (val title : String, val authors : String, val ISBN: Int) {

  open  fun displayInfo() = "title $title, authors $authors, ISBN $ISBN "
}