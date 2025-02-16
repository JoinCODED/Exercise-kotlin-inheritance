package library
fun main (){
    val fictionBook = FictionBook("Harry Potter",
        "J.K. Rowling",
        "978-0747532743",
        "Fantasy")
    val nonFictionBook = NonFictionBook("A Brief History of Time",
        "Stephen Hawking",
        "978-0553109535",
        "Science")

    println("Fiction Book Info:")
    fictionBook.displayInfo()
    fictionBook.recommend()

    println("\n")

    println("Non-Fiction Book Info:")
    nonFictionBook.displayInfo()
    nonFictionBook.funFact()
}
