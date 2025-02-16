package library


fun main() {
    val fictionBook = FictionBook("The Magic Realm", "Jane Smith", "987-654321", "Fantasy")
    val nonFictionBook = NonFictionBook("A Brief History of Time", "Stephen Hawking", "123-987654", "Science")

    println("Fiction Book Info:")
    fictionBook.displayInfo()

    println("\nNon-Fiction Book Info:")
    nonFictionBook.displayInfo()

    //Step 6 experiment
    fictionBook.addToReadingList()
    nonFictionBook.addToReadingList()

    fictionBook.displayInfo()
    nonFictionBook.displayInfo()
}

fun Book.addToReadingList() {
    println("Added $title to the reading list!")
}