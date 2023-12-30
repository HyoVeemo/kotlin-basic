package access.ex

class ShoppingCartMain {
    fun run() {
        val cart = ShoppingCart()

        val item1 = Item("상추", 1000, 2)
        val item2 = Item("양파", 3000, 1)

        cart.addItem(item1)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)
        cart.addItem(item2)

        cart.displayItems()
    }
}

fun main() {
    ShoppingCartMain().run()
}