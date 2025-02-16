package library


class FictionBook (title:String , author:String, ISBN :Int):Book(title , author , ISBN ){

    var genre:String = ""



   override fun displayInfo():String
    {
        return "${super.displayInfo()} , genre: $genre  "
    }


    fun fBook():String
    {
        return "$title used for kids "
    }

}