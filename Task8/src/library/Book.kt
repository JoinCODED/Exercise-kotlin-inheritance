package library

open class Book(var title: String, var author: String, var ISBN: Int){
    open fun displayInfo() = " $title by $author ( ISBN : $ISBN ) "
}

