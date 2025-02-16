package library

class FictionBook(title: String, author: String, iSBN: Int, val genre: String): Book(title, author, iSBN){
    override fun printInfo(): String {
        return "${super.printInfo()} Genre: $genre"
    }
}