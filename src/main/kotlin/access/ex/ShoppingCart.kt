package access.ex

class ShoppingCart {
    private val items: Array<Item?> = arrayOfNulls<Item?>(10)
    private var itemCount: Int = 0

    fun addItem(item: Item) {
        if (itemCount >= items.size) {
            println("장바구가 가득 찼습니다. ")
            return
        }

        items[itemCount] = item
        itemCount += 1
    }

    fun displayItems() {
        println("장바구니 상품 출력")
        for (i in 0..<itemCount) {
            items[i]?.let { item ->
                println("상품명: ${item.getName()},합계:${item.getTotalPrice()} ")
            }
        }

        println("전체 가격 합: ${calculateTotalPrice()}")
    }

    private fun calculateTotalPrice(): Int {
        var totalPrice = 0
        for (i in 0..<itemCount) {
            totalPrice += items[i]?.getTotalPrice() ?: 0
        }

        return totalPrice
    }
}