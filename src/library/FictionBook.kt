package library

class FictionBook(title: String, author: String, ISBN: Int, val genre: String): Book(title,author,ISBN){

        override fun displayInfo() {
            super.displayInfo()
            println("Genre: $genre")
        }

        fun recommend() {
            println("Recommended for $genre lovers!")
        }
    fun isBestSeller() = println("$title is a bestseller in $genre")
    }
