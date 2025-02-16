package library
class FictionBook (title: String,
                   author: String,
                   isbn: String,
                   val genre: String):
    Book(title, author, isbn){
    override fun displayInfo (){
        super.displayInfo()
        println("Genre: $genre")
    }
    fun recommend (){
        println("If you like $genre books, " +
                "you should read $title!")
    }
}
