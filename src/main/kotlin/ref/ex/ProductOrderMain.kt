package ref.ex

class ProductOrderMain {
    fun createOrder(productName: String, price: Int, quantity: Int): ProductOrder {
        return ProductOrder(productName, price, quantity)
    }

    fun printOrders(products: List<ProductOrder>) {
        for (product in products) {
            println("상품명: ${product.productName}, 가격:${product.price}, 수량:${product.quantity}")
        }
    }

    fun getTotalAmount(orders: List<ProductOrder>): Int {
        return orders.fold(0) { total, order -> total + order.price * order.quantity }
    }

    fun run() {
        val products = mutableListOf<ProductOrder>()

        products += createOrder(productName = "두부", price = 2000, quantity = 2)
        products += createOrder(productName = "김치", price = 5000, quantity = 1)
        products += createOrder(productName = "콜라", price = 1500, quantity = 2)


        printOrders(products)
        println("총 결제 금액 : ${getTotalAmount(products)}")
    }
}


fun main(args: Array<String>) {
    ProductOrderMain().run()
}