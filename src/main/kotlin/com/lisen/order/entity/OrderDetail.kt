package com.lisen.order.entity

import java.math.BigDecimal
import javax.persistence.*

/**
 *
 *
 * @author   lisen
 * @create   2018-09-19 下午1:53
 *
 **/
@Entity
@Table(name = "t_order_detail")
data class OrderDetail(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = -1,
        var orderId: Int = -1,
        var productId: Int = -1,
        var productName: String = "",
        var productPrice: BigDecimal = BigDecimal.ZERO,
        var productQuantity: Int = 0,
        var productIcon: String = ""
)