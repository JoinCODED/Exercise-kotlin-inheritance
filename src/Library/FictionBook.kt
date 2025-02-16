package Library

class FictionBook (title: String,author: String,isbn: String, val genre:String, val summary: String): Book(title, author, isbn){

    fun displayFictionDetails() {
        println("Genre: $genre")
        println("$title is a fiction book on $summary and it is a $genre book.")
    }

    // Overriding the displayInfo method to include genre information
    override fun displayInfo() {
        super.displayInfo()  // Call the parent class method
        println("This is a $genre book.")
        println("Summary: $summary")
    }

}