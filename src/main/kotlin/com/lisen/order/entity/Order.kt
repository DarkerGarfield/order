package com.lisen.order.entity

import java.math.BigDecimal
import javax.persistence.*

/**
 *
 *
 * @author   lisen
 * @create   2018-09-19 下午1:45
 *
 **/

@Entity
@Table(name = "t_order")
data class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = -1,
        var buyerName: String = "",
        var buyerPhone: String = "",
        var buyerAddress: String = "",
        var buyerOpenId: String = "",
        var orderAmount: BigDecimal = BigDecimal.ZERO,
        var orderStatus: Int = 0,
        var payStatus: Int = 0
)