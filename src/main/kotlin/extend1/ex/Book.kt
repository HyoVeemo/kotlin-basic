package extend1.ex

class Book(
    name: String,
    price: Int,
    private val author: String,
    private val isbn: String
) : Item(name, price) {
    override fun print() {
        super.print()
        println("- 저자: = $author, isbn: = $isbn")
    }
}