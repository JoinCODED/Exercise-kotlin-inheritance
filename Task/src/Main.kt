package library


fun main() {
    val myFictionBook = FictionBook("Harry Potter","J. K. Rowling",
        12334230,"Adventure")
    val myNonFictionBook = NonFictionBook("Ottoman Empire", "Mohamed the Conqueror",
        15357765, "History")

    println(myNonFictionBook)
    println(myFictionBook)

}