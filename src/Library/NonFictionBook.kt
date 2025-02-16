package Library


class NonFictionBook: Book(){

    var subjectArea:String = ""

    fun nonFictionBookPrint(){

        println( "${displayInfo()} Subject Area: "+subjectArea)
    }
}