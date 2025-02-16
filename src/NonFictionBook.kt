package library

class NonFictionBook(title: String, author: String, iSBN: Int, val authorsCited: Int): Book(title, author, iSBN) {
    override fun printInfo(): String {
        if(authorsCited <= 0){
            println("No authors cited this book.")
        } else {
        return "${super.printInfo()} Authors Cited: $authorsCited"
        }
        return ""
    }
}