import Library.FictionBook
import Library.NonFictionBook

fun main() {


    var nonFiction = NonFictionBook()

    nonFiction.title = "Harry potter"
    nonFiction.subjectArea= "Magic"
    nonFiction.author= "Jk Rowing"
    nonFiction.ISBN=100002
    nonFiction.nonFictionBookPrint()
println("-------")
    var fiction = FictionBook()
    fiction.title = "Some real book"
    fiction.genre= "Buissines "
    fiction.author= "Someone"
    fiction.ISBN=10009

    fiction.fictionBookPrint()
}