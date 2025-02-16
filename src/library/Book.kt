package library

open class Book(val title:String,val author:String,val ISBN:Int) {
    open fun displayInfo(){
        println("Title: $title, Author: $author, ISBN: $ISBN")
    }

}


