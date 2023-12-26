package contruct.ex

class Book {
    var title: String? = null
    var author: String? = null
    var page: Int? = null

    constructor() : this("", "", 0)
    constructor(title: String, author: String) : this(title, author, 0)

    constructor(title: String, author: String, page: Int) {
        this.page = page
        this.title = title
        this.author = author
    }

    fun displayInfo() {
        println("제목: ${this.title}, 저자: ${this.author}, 페이지:${this.page} ,")
    }

}

class BookInit(title: String?, author: String?, page: Int?) {
    var title: String? = ""
    var author: String? = ""
    var page: Int? = 0

    init {
        this.page = page
        this.title = title
        this.author = author
    }

    fun displayInfo() {
        println("제목: ${this.title}, 저자: ${this.author}, 페이지:${this.page} ,")
    }

}