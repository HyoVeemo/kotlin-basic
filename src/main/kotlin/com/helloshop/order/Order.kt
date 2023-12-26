package com.helloshop.order

import com.helloshop.product.Product
import com.helloshop.user.User

class Order(
    val user: User,
    val product: Product
)