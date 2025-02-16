package library

fun main() {
    var myNovel = Book("Silence of The Lambs", "Thomas Harris", 32242)
    var myNovel2 = FictionBook("GOT", "George R.R Martin", 3424212, "fantasy")
    var myNovel3 = NonFictionBook("Fargeo", "Noah Hawley", 342424689, 1)

    println(myNovel.printInfo())
    println(myNovel2.printInfo())
    println(myNovel3.printInfo())
}