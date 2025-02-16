import library.FictionBook
import library.NonFictionBook

fun main() {

    var   fBook = FictionBook("fantasy","disny",342)
    var   nfBook = NonFictionBook("Introduction to C++", "Najla" , 765854 ,"C++")

    println("----for Fiction Book ---")
    println(fBook.displayInfo())
    println(fBook.fBook())

    println("----for Non Fiction Book ---")
    println(nfBook.displayInfo())
    println(nfBook.nonFBook())
}