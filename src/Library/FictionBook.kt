package Library

class FictionBook: Book(){

    var genre:String = ""


    fun fictionBookPrint(){

        println( "${displayInfo()} Genre: "+genre)
    }
}