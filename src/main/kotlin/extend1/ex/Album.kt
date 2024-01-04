package extend1.ex

// val 을 안 붙히면..
class Album(name: String, price: Int, private val artist: String) : Item(name, price) {

    override fun print() {
        super.print()
        println("- 아티스트: $artist")
    }
}