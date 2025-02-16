package library

class Book(var title: String, var author: String, var ISBN: String) {

    fun getInfo(): String{
        return "$title by $author (ISBN: $ISBN)"
    }

    fun displayInfo(): Unit {
        println(getInfo())
    }
}