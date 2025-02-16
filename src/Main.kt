import library.FictionBook
import library.NonFictionBook

fun main() {
    var fiction = FictionBook("The Hobbit","Robert",isbn= 133444,"fiction")
    fiction.getInfoFiction()
    fiction.bookSeries()

    var nonFic = NonFictionBook("The Martial Arts","martin",84447,"Art")
    nonFic.getInfoNonFictionBook()
}