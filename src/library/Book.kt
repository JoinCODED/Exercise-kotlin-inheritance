package library

open class Book(var title:String , var author:String,var ISBN:Int){


    open fun displayInfo(): String{
        return "The Book Number : $ISBN , Name: $title , autherd By: $author  "
    }
}
