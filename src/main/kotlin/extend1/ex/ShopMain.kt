package extend1.ex

class ShopMain {
    fun run() {
        val book = Book("java", 10000, "han", "123456")
        val album = Album("앨범1", 15000, "seo")
        val movie = Movie("영화1", 15000, "감독1", "배우2")

        book.print()
        album.print()
        movie.print()

        val sum = book.getPrice() + album.getPrice() + movie.getPrice()
        println("상품 가격의 값 합꼐 = $sum")
    }
}

fun main() {
    ShopMain().run()
}