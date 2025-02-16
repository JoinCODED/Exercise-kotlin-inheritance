package library

class FictionBook (title:String,author:String,ISBN:Int,var genre:String ):Book( title,  author,  ISBN){
    override fun  displayInfo(){
        println("${super.displayInfo()} welcome to la la land, where dreams come true- $genre")
    }
}