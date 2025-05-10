package library

fun main() {
    val myFirstBook = FictionBook("The Hobbit", "J.R.R. Tolkien", 12743,"Fantasy")
    val mySecondBook = NonFictionBook("Atomic Habits", "James Clear", 46588,"Personal Development", 320 )

    val myChoice = myFirstBook.choiceOfBook()
    val myFictionBookInfo = myFirstBook.displayInfo()
    println(myChoice)
    println(myFictionBookInfo)

    println("---------------")

    val myNonFictionBook = mySecondBook.displayInfo()
    val finishingTheBook = mySecondBook.numberOfDaysToFinish(30)
    println(myNonFictionBook)
    println(finishingTheBook)



}