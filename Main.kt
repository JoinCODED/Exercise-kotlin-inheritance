package library

fun main() {
    // FictionBook
    val fictionBook = FictionBook(" xxxxx", "fatma", "7647647", "Fantasy")

    // NonFictionBook
    val nonFictionBook = NonFictionBook("xxxxx", "Alzain", "7467464378", "science")

    //  FictionBook
    println("Fiction Book Details:")
    fictionBook.displayInfo()
    fictionBook.brief()

    println("")
    println("")

    // NonFictionBook
    println("Non-Fiction Book :")
    nonFictionBook.displayInfo()
    nonFictionBook.similarBooks()
}


