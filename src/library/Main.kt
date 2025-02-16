package library

fun main(){
    val book1 = Book("Atomic habits", "James Clear", 3648796)

    val nonFicBook1 = NonFictionBook(
        "Dopamine Detox",
        "Thibaut Meurisse",
        878683,
        "Science")

    val fictionBook1 = FictionBook(
        "Harry Potter and the Sorcerer’s Stone",
        "J.K. Rowling",
        238492,
        "Fantasy")

    println(book1.displayInfo())
    //non fiction
    println(nonFicBook1.nonFiction())
    println(nonFicBook1.displayNonfictionInfo())
    //fiction
    println(fictionBook1.fiction())
    println(fictionBook1.displayFictionInfo())
}

