package library

//**Step 3: Building the `FictionBook` Subclass 🧙**
//
//- Create **`FictionBook.kt`** in the same package.
//- The **`FictionBook`** class should inherit from **`Book`** and include additional attributes like genre (e.g., fantasy, science fiction).
//- Implement methods specific to fiction books.


class FictionBook(
    title: String,
    author: String,
    ISBN: String,
    var genre: String,
    var imagePath: String
): Book(title, author, ISBN) {

     override fun getInfo(): String{
        return "$genre - $title by $author (ISBN: $ISBN)"
    }

    fun getImageURL(): String {
        return "https://yousite.com/$imagePath";
    }
}