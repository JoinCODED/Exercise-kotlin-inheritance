import library.*

fun Book.getInfo(){
    println(this)
}
fun main() {
    var myFictionBook = FictionBook("Harry Potter", "JK Rowling", "10-4y5723y4828u2", "Fantasy")
    myFictionBook.displayFictionInfo()

    var myNonFictionBook = NonFictionBook("Atomic Habits", "James Clear", "10-4563b6346b34", "Self-Help")
    println(myNonFictionBook.NonFictionInfo())

    // Testing toString
    println(myFictionBook)

    myFictionBook.read()
    myNonFictionBook.read()

}
