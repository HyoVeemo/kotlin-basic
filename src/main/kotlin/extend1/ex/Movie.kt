package extend1.ex

class Movie(name: String, price: Int, val director: String, val actor: String) : Item(name, price) {
    override fun print() {
        super.print()
        println("- 감독: $director, 배우: $actor")
    }
}