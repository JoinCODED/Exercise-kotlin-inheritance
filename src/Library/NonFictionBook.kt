package library

    open class NonFictionBook ( title: String, author: String, price: Int,
                             var Subject: String ):  Book ( title, author, price) {

        override fun displayInfo()= "${super.displayInfo()}, $Subject"
    }
