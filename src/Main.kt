import library.*

fun main() {
    val harryPotter = FictionBook("Harry Potter","Mahmood Fahad", 87328713,"Sci-Fi")
    val mathInAlgebra = NonFictionBook("Math in Algebra","Ali Alsarraf", 41228713,"Math")
    println(harryPotter.displayInfo())
    println(mathInAlgebra.displayInfo())
}


