package library

open class Book(var title: String, var author: String, var ISBN: String) {

    open fun getInfo(): String{
        return "$title by $author (ISBN: $ISBN)"
    }

    fun displayInfo(): Unit {
        println(getInfo())
    }
}