package Library

fun main(){
    val fiction= FictionBook("The Lord of the Rings","J.R.R. Tolkien",
        "Fantasy", 56467837)

    val nonFiction = Nonfictional("Sapiens", "Yuval Noah Harari",
        "History", 788276)

   println(fiction)
    println(nonFiction)
}