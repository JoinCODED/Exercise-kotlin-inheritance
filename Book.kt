package library

open class Book (var title : String = "",var author:String = "",var ISBN:String="" ){
    open fun displayInfo(){
        println("Title: $title ,author: $author ,ISBN: $ISBN ")
    }
}
