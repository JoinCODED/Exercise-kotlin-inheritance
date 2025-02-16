import library.*

fun main() {
    var myFictionBook = FictionBook("Harry Potter", "Jk.Rowling", 1234, "Fantasy")
    var myNonFictionBook = NonFictionBook("AlOjairi Calender", "Saleh AlOjairy", 1155, "Science")


    myFictionBook.displayInfo()
    myNonFictionBook.displayInfo()
}