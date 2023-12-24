package ref.ex

import java.util.*

class ProductOrderMain2 {
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
        val scanner = Scanner(System.`in`)
        println("입력할 주문의 개수를 입력하세요.:")
        val n = scanner.nextInt()
        scanner.nextLine()

        val products = mutableListOf<ProductOrder>()
        for (i in 0..<n) {
            println("${i + 1} 번째 주문 정보를 입력하세요")

            println("상품명: ")
            val productName = scanner.nextLine()
            println("가격: ")
            val price = scanner.nextInt()
            println("수량: ")
            val quantity = scanner.nextInt()
            scanner.nextLine() // 입력 버퍼를 비우기 위한 코드
            products += createOrder(productName, price, quantity)
        }

        printOrders(products)
        println("총 결제 금액 : ${getTotalAmount(products)}")
    }
}


fun main(args: Array<String>) {
    ProductOrderMain2().run()
}