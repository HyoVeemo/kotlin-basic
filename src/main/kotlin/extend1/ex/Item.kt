package extend1.ex

open class Item(private var name: String, private var price: Int) {
    open fun print() {
        println("이름: $name, 가격: $price")
    }

    fun getPrice(): Int {
        return this.price
    }
}