import Library.*

fun main() {
    println("Hello World!")

    val myFictionalBook = FictionBook("Game of thrones",
                "Gorge R R Martin",
                22012, "Fiction",500, userType = "normal")
    val myNonFictionalBook = NonFictionBook("War World 2", "Someone", 12932, "History")

    println(myFictionalBook.displayInfo())
    println(myFictionalBook.numberOfpages())
    println(myNonFictionalBook.displayInfo())
    println(myNonFictionalBook.whatsTheSubject())

    println("----")

    val fictionBookAdmin = FictionBook("Game of thrones",
        "Gorge R R Martin",
        22012, "Fiction",500, "admin")
    println(fictionBookAdmin.displayInfo())
    println(fictionBookAdmin.numberOfpages())
}