package Library

open class FictionBook(val title: String,val author: String, val genre:String, val isbn: Int ) {
    open fun displayInfo(){
        println("Title:$title")
        println("Author: $author")
        println("Genre:$genre")
        println("ISBN: $isbn")
    }
    fun main(){
        val fictional = FictionBook("The Outsiders","S.E.Hinton","Young Adult",  64673497 )
        fictional.displayInfo()
    }
}
