package Library

open class Nonfictional (val title: String,
                         val author: String,val genre:String, val isbn: Int ) {
    open fun displayInfo(){
        println("Title:$title")
        println("Author: $author")
        println("ISBN: $isbn")
        println("Genre:$genre")
    }
    fun main(){
        val nonFictional = Nonfictional("The Autobiography of Malcolm X",
            "Alex Haley and Malcolm X", "Autobiography", 4658687 )
        nonFictional.displayInfo()
    }
}
