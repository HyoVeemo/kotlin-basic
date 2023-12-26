package contruct.ex

class BookMain {
    fun run() {
        // 기본 생성자
        val book = Book()
        book.displayInfo()

        // 제목과 저자만 매개변수로 갖는 생성자
        val book2 = Book("hello java", "seo")
        book2.displayInfo()

        // 모든 필드를 매개변수로 받는 생성자
        val book3 = Book("hello java", "seo", 700)
        book3.displayInfo()

    }
}

fun main() {
    BookMain().run()
}