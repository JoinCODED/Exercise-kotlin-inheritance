package library

fun main() {
    val ficBook1 = FictionBook()
    ficBook1.title = "Delicious in dungeon"
    ficBook1.author = "Ryoko Kui"
    ficBook1.yearPublished = 2014
    ficBook1.fictionGenre("fantasy, adventure")

    val nonficBook1 = NonFictionBook()
    nonficBook1.title = "Monster"
    nonficBook1.author = "Naoki Urasawa"
    nonficBook1.yearPublished = 1994
    nonficBook1.nonFictionGenre("Crime, Mystery, Psychological thriller")

    ficBook1.displayInfo()
    nonficBook1.displayInfo()
}