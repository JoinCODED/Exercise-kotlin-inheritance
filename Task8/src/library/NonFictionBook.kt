package library

class NonFictionBook (title:String , author:String , ISBN:Int , var genre: String, var numberOfPages: Int ): Book(title, author,ISBN)
    {
        fun numberOfDaysToFinish(pages: Int) = "If you read $pages pages a day you will finish the book within " + numberOfPages/pages + " days"
        override fun displayInfo() = "${super.displayInfo()} Book Genre: $genre - It contains $numberOfPages pages"

    }
