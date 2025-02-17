package Library
open class Book(val title: String, val author: String, val ISBN: String) {

    // Method to display book information
    fun displayInfo() {
        println("$title ($author) - $ISBN ")
    }
}

