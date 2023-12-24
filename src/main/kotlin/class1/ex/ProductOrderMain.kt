package class1.ex

class ProductOrderMain {
    fun run(){
        val products = mutableListOf<ProductOrder>()
        var total = 0
        products += ProductOrder(productName = "두부", price = 2000, quantity = 2)
        products += ProductOrder(productName = "김치", price = 5000, quantity = 1)
        products += ProductOrder(productName = "콜라", price = 1500, quantity = 2)

        for( product in products){
            println("상품명: ${product.productName}, 가격:${product.price}, 수량:${product.quantity}")
            total += product.price * product.quantity
        }
        println("총 결제 금액: $total")

    }
}


fun main(args: Array<String>) {
    ProductOrderMain().run()
}