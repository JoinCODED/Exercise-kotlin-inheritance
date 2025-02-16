import library.*

fun main() {
    val myBook = Book("Dragon Ball", "Akira Toriyama", 7777777);
    println(myBook.displayInfo());

    val myFictionBook = FictionBook("The Lord of the Rings", "George R R Martin", 3456789, "Fantasy", true);
    println(myFictionBook.displayInfo());

    val myNonFictionBook = NonFictionBook("In Cold Blood", "Truman Capote", 9876543, "Homicide");
    println(myNonFictionBook.displayInfo());
}