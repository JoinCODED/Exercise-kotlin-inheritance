package library


class FictionBook(title : String = "",author:String = "",ISBN:String="",val genre: String=""): Book(title, author, ISBN){
    override fun displayInfo(){
        super.displayInfo()
        println("Genre: $genre")

    }
    fun brief(){
        println("$title is a $genre book written by $author, It offers imaginative story.")

    }

}

