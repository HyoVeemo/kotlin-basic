package com.helloshop.order

import com.helloshop.product.Product
import com.helloshop.user.User

class OrderService {
    fun order() {
        val user = User()
        val product = Product()
        val order = Order(user, product)
    }

}