package library

class NonFictionBook(title: String, author: String, isbn: Int, val area: String):
    Book(title, author, isbn) {
        override fun displayInfo() = "${super.displayInfo()}, Area: ${area}";
}
