package access.ex

class Item(
    private val name: String,
    private val price: Int,
    private val quantity: Int
) {
    fun getName(): String {
        return name
    }

    fun getTotalPrice(): Int {
        return price * quantity
    }
}