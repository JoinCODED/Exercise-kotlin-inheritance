import Library.*


fun main() {
    var book1 = FictionBook("fiction", "author of book",
        12323, "Horror")
    var book2 = NonFictionBook("non fiction", "author of book",
        123, "history")
    println(book1.toString())
 //   book1.displayInfo()
    book1.getGenre()
    println(book2.toString())
  //  book2.displayInfo()
    book2.getSubject()

}